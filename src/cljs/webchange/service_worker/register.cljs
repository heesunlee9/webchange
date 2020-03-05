(ns webchange.service-worker.register
  (:require [re-frame.core :as re-frame]
            [webchange.service-worker.events :as events]
            [webchange.service-worker.subscribe :refer [subscribe-to-notifications]]))

(defn worker-ready
  [_]
  (re-frame/dispatch [::events/set-offline-mode :ready]))

(defn track-installing
  [worker]
  (re-frame/dispatch [::events/set-offline-mode :in-progress])
  (.addEventListener worker "statechange" (fn []
                                            (when (= "activated" (.-state worker))
                                              (worker-ready worker)))))

(defn check-state
  [registration]
  (if-let [active (.-active registration)]
    (worker-ready active)
    (if-let [installing (.-installing registration)]
      (track-installing installing)
      (.addEventListener registration "updatefound" #(track-installing (.-installing registration))))))

(defn register
  [service-worker path]
  (-> (.register service-worker path)
      (.then check-state)
      (.catch #(println (str "[ServiceWorker] Registration failed:" %)))))

(defn unregister
  [service-worker]
  (-> (.getRegistrations service-worker)
      (.then (fn [registrations]
               (when (> (count registrations) 0)
                 (->> (.shift registrations)
                      (.unregister)))))))

(defn setup
  [use-cache path]
  (let [service-worker (.-serviceWorker js/navigator)]
    (when service-worker
      (if use-cache
        (do (register service-worker path)
            (subscribe-to-notifications))
        (unregister service-worker)))))
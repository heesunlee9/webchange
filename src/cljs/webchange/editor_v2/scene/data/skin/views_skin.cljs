(ns webchange.editor-v2.scene.data.skin.views-skin
  (:require
    [cljs-react-material-ui.reagent :as ui]
    [re-frame.core :as re-frame]
    [webchange.editor-v2.scene.state.skin :as skin]))

(defn change-skin
  []
  (let [enabled? @(re-frame/subscribe [::skin/animation-selected?])
        skins @(re-frame/subscribe [::skin/available-skins])
        current-skin @(re-frame/subscribe [::skin/current-skin])]
    [ui/form-control {:full-width true
                      :margin     "normal"}
     [ui/select {:value     (or current-skin "")
                 :disabled (not enabled?)
                 :display-empty true
                 :on-change #(re-frame/dispatch [::skin/change-skin (.. % -target -value)])}
      [ui/menu-item {:value "" :disabled true} "Select skin"]
      (when enabled?
        (for [skin skins]
          ^{:key skin}
          [ui/menu-item {:value skin} skin]))]]))

(ns webchange.editor-v2.graph-builder.utils.counter-map-test
  (:require
    [cljs.test :refer [deftest testing is]]
    [webchange.editor-v2.graph-builder.utils.counter-map :refer [add-to-map
                                                            map-has-name?]]))

(deftest test-add-to-map
  (testing "adding new item"
    (let [map {}
          name "action-1"]
      (let [actual-result (add-to-map map name)
            expected-result [{:action-1 1} 1]]
        (is (= actual-result expected-result)))))
  (testing "adding exists item"
    (let [map {:action-1 1}
          name "action-1"]
      (let [actual-result (add-to-map map name)
            expected-result [{:action-1 2} 2]]
        (is (= actual-result expected-result))))))

(deftest test-map-has-name?
  (testing "checking has name"
    (let [map {:action-1 1}
          name "action-1"]
      (let [actual-result (map-has-name? map name)
            expected-result true]
        (is (= actual-result expected-result)))))
  (testing "checking has not name"
    (let [map {:action-1 1}
          name "action-2"]
      (let [actual-result (map-has-name? map name)
            expected-result false]
        (is (= actual-result expected-result))))))

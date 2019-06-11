(ns webchange.demo-scenes.park.sandbox)

(def sandbox-scene
  {:assets
                  [{:url "/raw/audio/l1/a4/Mari_Level1_Activity4.m4a", :size 5, :type "audio" :alias "mari voice"}
                   {:url "/raw/audio/l1/a4/L1_A4_GameVoice_Set 1.m4a", :size 5, :type "audio" :alias "game voice 1"}
                   {:url "/raw/audio/l1/a4/L1_A4_GameVoice_Set 2.m4a", :size 5, :type "audio" :alias "game voice 2"}
                   {:url "/raw/audio/l1/a4/L1_A4_GameVoice_Set 3.m4a", :size 5, :type "audio" :alias "game voice 3"}

                   {:url "/raw/img/park/sandbox/background.jpg", :size 10 :type "image"}

                   ],
   :objects
                  {:background {:type "background", :src "/raw/img/park/sandbox/background.jpg"},

                   :mari {:type "animation" :scene-name "mari" :name "mari" :anim "idle"
                          :start true :speed 0.35
                          :x 1535 :y 715 :width 473 :height 511
                          :scale-y 0.5 :scale-x 0.5}

                   :word {:type "transparent" :x 313 :y 91 :width 1200 :height 400
                          :states {:default {:type "transparent"}
                                   :show {:type "text" :width 1200 :height 400
                                          :align "center" :vertical-align "middle"
                                          :font-family "Luckiest Guy" :font-size 160
                                          :shadow-color "#1a1a1a" :shadow-offset {:x 5 :y 5} :shadow-blur 5 :shadow-opacity 0.5
                                          :fill "white"}}}

                   :box1 {:type "animation" :x 304 :y 826 :width 771 :height 1033 :anim-offset {:x 0 :y -300}
                          :name "boxes" :anim "idle2" :scale {:x 0.25 :y 0.25} :speed 0.3 :loop true :start false
                          :scene-name "box1" :transition "box1" :skin "qwestion"
                          :actions {:click {:type "action" :id "box-1-start" :on "click"}}}

                   :box2 {:type "animation" :x 401 :y 696 :width 771 :height 1033 :anim-offset {:x 0 :y -300}
                          :name "boxes" :anim "idle2" :scale {:x 0.25 :y 0.25} :speed 0.3 :loop true :start false
                          :scene-name "box2" :transition "box2" :skin "qwestion"
                          :actions {:click {:type "action" :id "box-2-start" :on "click"}}}

                   :box3 {:type "animation" :x 600 :y 674 :width 771 :height 1033 :anim-offset {:x 0 :y -300}
                          :name "boxes" :anim "idle2" :scale {:x 0.25 :y 0.25} :speed 0.3 :loop true :start false
                          :scene-name "box3" :transition "box3" :skin "qwestion"
                          :actions {:click {:type "action" :id "box-3-start" :on "click"}}}

                   :box4 {:type "animation" :x 919 :y 741 :width 771 :height 1033 :anim-offset {:x 0 :y -300}
                          :name "boxes" :anim "idle2" :scale {:x 0.25 :y 0.25} :speed 0.3 :loop true :start false
                          :scene-name "box4" :transition "box4" :skin "qwestion"
                          :actions {:click {:type "action" :id "box-4-start" :on "click"}}}

                   },
   :scene-objects [["background"] ["box3" "box4" "box2" "box1" "word"] ["mari"]],
   :actions
                  {:mari-welcome-audio
                   {:type "animation-sequence" :target "mari" :track 1 :offset 0.702
                    :audio "/raw/audio/l1/a4/Mari_Level1_Activity4.m4a" :start 0.702, :duration 5.914
                    :data [{:start 0.775 :end 2.67 :anim "talk"}
                           {:start 3.189 :end 6.433 :anim "talk"}]}

                   :mari-touch-audio
                   {:type "animation-sequence" :target "mari" :track 1 :offset 35.155
                    :audio "/raw/audio/l1/a4/Mari_Level1_Activity4.m4a", :start 35.155, :duration 3.973
                    :data [{:start 35.31 :end 38.992 :anim "talk"}]}

                   :mari-more-audio
                   {:type "animation-sequence" :target "mari" :track 1 :offset 44.997
                    :audio "/raw/audio/l1/a4/Mari_Level1_Activity4.m4a", :start 44.997, :duration 4.337
                    :data [{:start 45.352 :end 46.655 :anim "talk"}
                           {:start 47.101 :end 49.088 :anim "talk"}]}

                   :mari-one-more-audio {:type "parallel"
                                     :data [{:type "audio", :id "teacher", :start 0.77, :duration 3.24}
                                            {:type "sequence-data"
                                             :data [{:type "empty" :duration 225}
                                                    {:type "animation" :target "mari" :id "talk" :track 1}
                                                    {:type "empty" :duration 1307}
                                                    {:type "animation" :target "mari" :id "empty" :track 1}
                                                    {:type "empty" :duration 550}
                                                    {:type "animation" :target "mari" :id "talk":track 1}
                                                    {:type "empty" :duration 1069}
                                                    {:type "animation" :target "mari" :id "empty" :track 1}]}]}

                   :mari-good-job {:type "parallel"
                                     :data [{:type "audio", :id "teacher", :start 0.77, :duration 3.24}
                                            {:type "sequence-data"
                                             :data [{:type "empty" :duration 225}
                                                    {:type "animation" :target "mari" :id "talk" :track 1}
                                                    {:type "empty" :duration 1307}
                                                    {:type "animation" :target "mari" :id "empty" :track 1}
                                                    {:type "empty" :duration 550}
                                                    {:type "animation" :target "mari" :id "talk":track 1}
                                                    {:type "empty" :duration 1069}
                                                    {:type "animation" :target "mari" :id "empty" :track 1}]}]}

                   :mari-this-is-letter-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-this-is-letter-action"}]}

                   :complete-word-1  {:type "set-variable" :var-name "word-1" :var-value true}
                   :complete-word-2  {:type "set-variable" :var-name "word-2" :var-value true}
                   :complete-word-3  {:type "set-variable" :var-name "word-3" :var-value true}
                   :complete-word-4  {:type "set-variable" :var-name "word-4" :var-value true}

                   :box-1-start-animation {:type "start-animation" :target "box1"}
                   :box-2-start-animation {:type "start-animation" :target "box2"}
                   :box-3-start-animation {:type "start-animation" :target "box3"}
                   :box-4-start-animation {:type "start-animation" :target "box4"}

                   :box-1-start {:type "sequence"
                                 :data ["complete-word-1"
                                        "word-1-state-var"
                                        "box-1-start-animation"
                                        "box-1-jump-in"
                                        "word-1-state-var"
                                        "box-1-jump-out"
                                        "word-1-state-var"
                                        "test-concept-complete"]}

                   :word-1-state-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-state-word-1-action"}]}
                   :word-2-state-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-state-word-2-action"}]}
                   :word-3-state-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-state-word-3-action"}]}
                   :word-4-state-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-state-word-4-action"}]}

                   :box-1-jump-in {:type "parallel"
                                   :data [{:type "animation" :target "box1" :id "jump2"}
                                          {:type "sequence-data"
                                           :data [{:type "empty" :duration 500}
                                                  {:type "transition" :transition-id "box1" :to {:x 668 :y 798 :duration 0.7 :loop false}}]}
                                          {:type "add-animation" :target "box1" :id "idle2" :loop true}]}

                   :box-1-jump-out {:type "parallel"
                                   :data [{:type "animation" :target "box1" :id "jump2"}
                                          {:type "sequence-data"
                                           :data [{:type "empty" :duration 500}
                                                  {:type "transition" :transition-id "box1" :to {:x 304 :y 826 :duration 0.7 :loop false}}]}
                                          {:type "add-animation" :target "box1" :id "idle2" :loop true}]}

                   :box-2-start {:type "sequence"
                                 :data ["complete-word-2"
                                        "word-2-state-var"
                                        "box-2-start-animation"
                                        "box-2-jump-in"
                                        "word-2-state-var"
                                        "box-2-jump-out"
                                        "word-2-state-var"
                                        "test-concept-complete"]}

                   :box-2-jump-in {:type "parallel"
                                   :data [{:type "animation" :target "box2" :id "jump2"}
                                          {:type "sequence-data"
                                           :data [{:type "empty" :duration 500}
                                                  {:type "transition" :transition-id "box2" :to {:x 668 :y 798 :duration 0.7 :loop false}}]}
                                          {:type "add-animation" :target "box2" :id "idle2" :loop true}]}

                   :box-2-jump-out {:type "parallel"
                                    :data [{:type "animation" :target "box2" :id "jump2"}
                                           {:type "sequence-data"
                                            :data [{:type "empty" :duration 500}
                                                   {:type "transition" :transition-id "box2" :to {:x 401 :y 696 :duration 0.7 :loop false}}]}
                                           {:type "add-animation" :target "box2" :id "idle2" :loop true}]}

                   :box-3-start {:type "sequence"
                                 :data ["complete-word-3"
                                        "word-3-state-var"
                                        "box-3-start-animation"
                                        "box-3-jump-in"
                                        "word-3-state-var"
                                        "box-3-jump-out"
                                        "word-3-state-var"
                                        "test-concept-complete"]}

                   :box-3-jump-in {:type "parallel"
                                   :data [{:type "animation" :target "box3" :id "jump2"}
                                          {:type "sequence-data"
                                           :data [{:type "empty" :duration 500}
                                                  {:type "transition" :transition-id "box3" :to {:x 668 :y 798 :duration 0.7 :loop false}}]}
                                          {:type "add-animation" :target "box3" :id "idle2" :loop true}]}

                   :box-3-jump-out {:type "parallel"
                                    :data [{:type "animation" :target "box3" :id "jump2"}
                                           {:type "sequence-data"
                                            :data [{:type "empty" :duration 500}
                                                   {:type "transition" :transition-id "box3" :to {:x 600 :y 674 :duration 0.7 :loop false}}]}
                                           {:type "add-animation" :target "box3" :id "idle2" :loop true}]}


                   :box-4-start {:type "sequence"
                                 :data ["complete-word-4"
                                        "word-4-state-var"
                                        "box-4-start-animation"
                                        "box-4-jump-in"
                                        "word-4-state-var"
                                        "box-4-jump-out"
                                        "word-4-state-var"
                                        "test-concept-complete"]}

                   :box-4-jump-in {:type "parallel"
                                   :data [{:type "animation" :target "box4" :id "jump2"}
                                          {:type "sequence-data"
                                           :data [{:type "empty" :duration 500}
                                                  {:type "transition" :transition-id "box4" :to {:x 668 :y 798 :duration 0.7 :loop false}}]}
                                          {:type "add-animation" :target "box4" :id "idle2" :loop true}]}

                   :box-4-jump-out {:type "parallel"
                                    :data [{:type "animation" :target "box4" :id "jump2"}
                                           {:type "sequence-data"
                                            :data [{:type "empty" :duration 500}
                                                   {:type "transition" :transition-id "box4" :to {:x 919 :y 741 :duration 0.7 :loop false}}]}
                                           {:type "add-animation" :target "box4" :id "idle2" :loop true}]}

                   :test-concept-complete  {:type "test-var-list"
                                            :var-names ["word-1" "word-2" "word-3" "word-4"]
                                            :values [true true true true]
                                            :success "next-concept-workflow"}

                   :hide-word  {:type "state" :target "word" :id "default"}

                   :renew-words  {:type "lesson-var-provider"
                                  :provider-id "words-set"
                                  :variables ["item-1" "item-2" "item-3"]
                                  :shuffled false
                                  :from      "concepts"}

                   :renew-current-concept {:type "parallel"
                                           :data [{:type "set-variable" :var-name "word-1" :var-value false}
                                                  {:type "set-variable" :var-name "word-2" :var-value false}
                                                  {:type "set-variable" :var-name "word-3" :var-value false}
                                                  {:type "set-variable" :var-name "word-4" :var-value false}
                                                  {:type "vars-var-provider"
                                                   :provider-id "current-word"
                                                   :variables ["current-word"]
                                                   :from ["item-1" "item-2" "item-3"]
                                                   :shuffled false
                                                   :on-end "finish-activity"}]}

                   :renew-current-concept-workflow {:type "sequence"
                                                    :data ["renew-current-concept"
                                                           "box-1-change-skin-var"
                                                           "box-2-change-skin-var"
                                                           "box-3-change-skin-var"
                                                           "box-4-change-skin-var"
                                                           "mari-this-is-letter-var"
                                                           "mari-touch-audio"]}

                   :next-concept-workflow {:type "sequence"
                                           :data ["mari-more-audio"
                                                  "renew-current-concept-workflow"]}

                   :box-1-change-skin-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-change-skin-1-action"}]}
                   :box-2-change-skin-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-change-skin-2-action"}]}
                   :box-3-change-skin-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-change-skin-3-action"}]}
                   :box-4-change-skin-var {:type "action" :from-var [{:var-name "current-word" :var-property "sandbox-change-skin-4-action"}]}

                   :clear-instruction {:type "remove-flows" :flow-tag "instruction"}
                   :start-activity {:type "sequence"
                                    :data ["clear-instruction"
                                           "renew-words"
                                           "mari-welcome-audio"
                                           "renew-current-concept-workflow"
                                           ]}

                   :finish-activity {:type "finish-activity" :id "sandbox"}}
   :audio
                  {:mari "/raw/audio/l1/a4/Mari_Level1_Activity4.m4a"
                   :voice-1 "/raw/audio/l1/a4/L1_A4_GameVoice_Set 1.m4a"
                   :voice-2 "/raw/audio/l1/a4/L1_A4_GameVoice_Set 2.m4a"
                   :voice-3 "/raw/audio/l1/a4/L1_A4_GameVoice_Set 3.m4a"},
   :triggers      {:start {:on "start" :action "start-activity"}}
   :metadata      {:autostart true
                   :prev "park"}})
(ns webchange.editor-v2.graph-builder.graph.data.volleyball-letters.source)

(def data {:assets
                     [{:url "/raw/audio/l2/a10/L2_A10_Mari.m4a", :type "audio"}
                      {:url "/raw/img/stadium/volleyball/background.jpg", :size 10, :type "image"}
                      {:url "/raw/img/stadium/volleyball/ball.png", :size 1, :type "image"}
                      {:url "/raw/audio/l2/mari-chants.m4a", :size 5, :type "audio", :alias "mari chants"}],
           :objects
                     {:background {:type "background", :src "/raw/img/stadium/volleyball/background.jpg"},
                      :ball
                                  {:type "group", :x 1163, :y 941, :width 126, :height 126, :transition "ball-transition", :children ["ball-image"]},
                      :ball-image
                                  {:type    "transparent",
                                   :width   126,
                                   :height  126,
                                   :origin  {:type "center-center"},
                                   :scale-x 0.5,
                                   :scale-y 0.5,
                                   :states  {:hidden {:type "transparent"}, :visible {:src "/raw/img/stadium/volleyball/ball.png", :type "image"}}},
                      :box1
                                  {:type        "animation",
                                   :x           1304,
                                   :y           831,
                                   :width       771,
                                   :height      1033,
                                   :scale       {:x 0.3, :y 0.3},
                                   :origin      {:type "center-center"},
                                   :scene-name  "box1",
                                   :actions     {:click {:id "check-concept", :on "click", :type "action", :params {:player "player1"}}},
                                   :anim        "idle1",
                                   :anim-offset {:x 0, :y -300},
                                   :name        "boxes",
                                   :skin        "empty"},
                      :box2
                                  {:type        "animation",
                                   :x           1665,
                                   :y           666,
                                   :width       771,
                                   :height      1033,
                                   :scale       {:x 0.3, :y 0.3},
                                   :origin      {:type "center-center"},
                                   :scene-name  "box2",
                                   :actions     {:click {:id "check-concept", :on "click", :type "action", :params {:player "player2"}}},
                                   :anim        "idle1",
                                   :anim-offset {:x 0, :y -300},
                                   :name        "boxes",
                                   :skin        "empty"},
                      :box3
                                  {:type        "animation",
                                   :x           309,
                                   :y           831,
                                   :width       771,
                                   :height      1033,
                                   :scale       {:x 0.3, :y 0.3},
                                   :origin      {:type "center-center"},
                                   :scene-name  "box3",
                                   :actions     {:click {:id "check-concept", :on "click", :type "action", :params {:player "player3"}}},
                                   :anim        "idle1",
                                   :anim-offset {:x 0, :y -300},
                                   :name        "boxes",
                                   :skin        "empty"},
                      :box4
                                  {:type        "animation",
                                   :x           629,
                                   :y           666,
                                   :width       771,
                                   :height      1033,
                                   :scale       {:x 0.3, :y 0.3},
                                   :origin      {:type "center-center"},
                                   :scene-name  "box4",
                                   :actions     {:click {:id "check-concept", :on "click", :type "action", :params {:player "player4"}}},
                                   :anim        "idle1",
                                   :anim-offset {:x 0, :y -300},
                                   :name        "boxes",
                                   :skin        "empty"},
                      :boy1
                                  {:type       "animation",
                                   :x          1556,
                                   :y          871,
                                   :width      758,
                                   :height     1130,
                                   :scale      {:x 0.25, :y 0.25},
                                   :scene-name "boy1",
                                   :anim       "idle",
                                   :name       "vera-45",
                                   :skin       "1_boy",
                                   :speed      0.3,
                                   :start      true},
                      :display
                                  {:type        "animation",
                                   :x           1085,
                                   :y           470,
                                   :width       771,
                                   :height      1033,
                                   :scale       {:x 0.3, :y 0.3},
                                   :origin      {:type "center-center"},
                                   :scene-name  "display",
                                   :anim        "idle_fly2",
                                   :anim-offset {:x 0, :y -300},
                                   :loop        true,
                                   :name        "boxes",
                                   :skin        "empty",
                                   :speed       0.3,
                                   :start       true},
                      :girl2
                                  {:type       "animation",
                                   :x          197,
                                   :y          1010,
                                   :width      758,
                                   :height     1130,
                                   :scale      {:x -0.25, :y 0.25},
                                   :scene-name "girl2",
                                   :anim       "idle",
                                   :name       "vera-45",
                                   :skin       "2_girl",
                                   :speed      0.3,
                                   :start      true},
                      :girl3
                                  {:type       "animation",
                                   :x          512,
                                   :y          871,
                                   :width      758,
                                   :height     1130,
                                   :scale      {:x -0.25, :y 0.25},
                                   :scene-name "girl3",
                                   :anim       "idle",
                                   :name       "vera-45",
                                   :skin       "3_girl",
                                   :speed      0.3,
                                   :start      true},
                      :letter1
                                  {:type           "text",
                                   :x              1100,
                                   :y              485,
                                   :width          200,
                                   :height         200,
                                   :actions        {:click {:id "check-concept", :on "click", :type "action", :params {:player "player1"}}},
                                   :align          "center",
                                   :fill           "#d25523",
                                   :font-family    "Lexend Deca",
                                   :font-size      120,
                                   :shadow-blur    2,
                                   :shadow-color   "#1a1a1a",
                                   :shadow-offset  {:x 2, :y 2},
                                   :shadow-opacity 0.5,
                                   :text           "",
                                   :vertical-align "middle"},
                      :letter2
                                  {:type           "text",
                                   :x              1461,
                                   :y              320,
                                   :width          200,
                                   :height         200,
                                   :actions        {:click {:id "check-concept", :on "click", :type "action", :params {:player "player2"}}},
                                   :align          "center",
                                   :fill           "#d25523",
                                   :font-family    "Lexend Deca",
                                   :font-size      120,
                                   :shadow-blur    2,
                                   :shadow-color   "#1a1a1a",
                                   :shadow-offset  {:x 2, :y 2},
                                   :shadow-opacity 0.5,
                                   :text           "",
                                   :vertical-align "middle"},
                      :letter3
                                  {:type           "text",
                                   :x              105,
                                   :y              485,
                                   :width          200,
                                   :height         200,
                                   :actions        {:click {:id "check-concept", :on "click", :type "action", :params {:player "player3"}}},
                                   :align          "center",
                                   :fill           "#d25523",
                                   :font-family    "Lexend Deca",
                                   :font-size      120,
                                   :shadow-blur    2,
                                   :shadow-color   "#1a1a1a",
                                   :shadow-offset  {:x 2, :y 2},
                                   :shadow-opacity 0.5,
                                   :text           "",
                                   :vertical-align "middle"},
                      :letter4
                                  {:type           "text",
                                   :x              425,
                                   :y              320,
                                   :width          200,
                                   :height         200,
                                   :actions        {:click {:id "check-concept", :on "click", :type "action", :params {:player "player4"}}},
                                   :align          "center",
                                   :fill           "#d25523",
                                   :font-family    "Lexend Deca",
                                   :font-size      120,
                                   :shadow-blur    2,
                                   :shadow-color   "#1a1a1a",
                                   :shadow-offset  {:x 2, :y 2},
                                   :shadow-opacity 0.5,
                                   :text           "",
                                   :vertical-align "middle"},
                      :mari
                                  {:type        "animation",
                                   :x           1265,
                                   :y           311,
                                   :width       473,
                                   :height      511,
                                   :scene-name  "mari",
                                   :transition  "mari",
                                   :anim        "idle",
                                   :anim-offset {:x 0, :y -150},
                                   :name        "mari",
                                   :scale-x     0.5,
                                   :scale-y     0.5,
                                   :speed       0.35,
                                   :start       true},
                      :vera
                                  {:type       "animation",
                                   :x          1182,
                                   :y          1010,
                                   :width      758,
                                   :height     1130,
                                   :scale      {:x 0.25, :y 0.25},
                                   :scene-name "vera",
                                   :anim       "volley_idle",
                                   :name       "vera-45",
                                   :skin       "vera",
                                   :speed      0.3,
                                   :start      true}},
           :scene-objects
                     [["background"]
                      ["vera" "boy1" "girl2" "girl3"]
                      ["box1" "letter1" "box2" "letter2" "box3" "letter3" "box4" "letter4"]
                      ["display" "mari" "ball"]],
           :actions
                     {:animate-catch-player1
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_call", :type "animation", :target "vera"}
                                                       {:id "volley_idle", :loop true, :type "add-animation", :target "vera"}]},
                      :animate-catch-player2
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_call", :type "animation", :target "boy1"}
                                                       {:id "volley_idle", :loop true, :type "add-animation", :target "boy1"}]},
                      :animate-catch-player3
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_call", :type "animation", :target "girl2"}
                                                       {:id "volley_idle", :loop true, :type "add-animation", :target "girl2"}]},
                      :animate-catch-player4
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_call", :type "animation", :target "girl3"}
                                                       {:id "volley_idle", :loop true, :type "add-animation", :target "girl3"}]},
                      :animate-throw-player1
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_throw", :type "animation", :target "vera"}
                                                       {:id "idle", :loop true, :type "add-animation", :target "vera"}]},
                      :animate-throw-player2
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_throw", :type "animation", :target "boy1"}
                                                       {:id "idle", :loop true, :type "add-animation", :target "boy1"}]},
                      :animate-throw-player3
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_throw", :type "animation", :target "girl2"}
                                                       {:id "idle", :loop true, :type "add-animation", :target "girl2"}]},
                      :animate-throw-player4
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "volley_throw", :type "animation", :target "girl3"}
                                                       {:id "idle", :loop true, :type "add-animation", :target "girl3"}]},
                      :check-concept
                                               {:type        "test-var-scalar",
                                                :var-name    "current-target",
                                                :success     "pick-correct",
                                                :fail        "pick-wrong",
                                                :from-params [{:param-property "player", :action-property "value"}]},
                      :empty-before-dialog     {:type "empty", :duration 3000},
                      :finish-activity
                                               {:type "sequence-data",
                                                :data [{:id "volleyball-letters", :type "finish-activity"} {:type "scene", :scene-id "stadium"}]},
                      :init-first-player       {:type "set-variable", :var-name "current-player", :var-value "player1"},
                      :init-slots
                                               {:type "parallel",
                                                :data
                                                      [{:type "set-variable", :var-name "slot1", :var-value "player1"}
                                                       {:type "set-variable", :var-name "slot2", :var-value "player2"}
                                                       {:type "set-variable", :var-name "slot3", :var-value "player3"}
                                                       {:type "set-variable", :var-name "slot4", :var-value "player4"}]},
                      :mari-welcome-audio
                                               {:phrase                 :welcome
                                                :phrase-description     "Welcome"
                                                :phrase-text            "It’s time to play volleyball with letters!  Listen to the words and touch the letter that makes the beginning sound of the word!"
                                                :phrase-text-translated "Es tiempo de jugar volleyball con las letras! Escucha las palabras y toca la letra que hacen el sonido al principio de la palabra!"
                                                :type                   "animation-sequence",
                                                :data
                                                                        [{:end 4.442, :anim "talk", :start 0.564}
                                                                         {:end 6.741, :anim "talk", :start 5.14}
                                                                         {:end 12.175, :anim "talk", :start 7.147}],
                                                :target                 "mari",
                                                :audio                  "/raw/audio/l2/a10/L2_A10_Mari.m4a",
                                                :start                  0.18,
                                                :duration               12.288,
                                                :track                  1,
                                                :offset                 0.18},
                      :pick-correct
                                               {:type "parallel",
                                                :data
                                                      [{:id "mari-correct", :type "action"}
                                                       {:type     "pick-correct",
                                                        :activity "volleyball",
                                                        :from-var [{:var-name "current-concept", :var-property "concept-name", :action-property "concept-name"}]}
                                                       {:id "throw", :type "action"}]},
                      :pick-wrong
                                               {:type "sequence-data",
                                                :data
                                                      [{:id "mari-wrong", :type "action"}
                                                       {:type "copy-variable", :var-name "picked", :from-params [{:param-property "player", :action-property "from"}]}
                                                       {:type     "pick-wrong",
                                                        :activity "volleyball",
                                                        :from-var
                                                                  [{:var-name "current-concept", :var-property "concept-name", :action-property "concept-name"}
                                                                   {:var-name "picked", :action-property "option"}]}]},
                      :renew-current-concept
                                               {:type "sequence-data",
                                                :data
                                                      [{:from        ["item-1" "item-2" "item-3" "item-4" "item-5" "item-6" "item-7" "item-8" "item-9" "item-10"],
                                                        :type        "vars-var-provider",
                                                        :on-end      "finish-activity",
                                                        :shuffled    true,
                                                        :variables   ["current-concept"],
                                                        :provider-id "current-concept"}
                                                       {:from      ["pair-1" "pair-2" "pair-3" "pair-4" "pair-5" "pair-6" "pair-7" "pair-8" "pair-9" "pair-10"],
                                                        :type      "vars-var-provider",
                                                        :unique    true,
                                                        :from-var
                                                                   [{:var-key         "concept-name",
                                                                     :var-name        "current-concept",
                                                                     :var-property    "concept-name",
                                                                     :action-property "exclude-property-values"}],
                                                        :shuffled  true,
                                                        :variables ["pair-concept-1" "pair-concept-2" "pair-concept-3"]}
                                                       {:data
                                                              [{:from      ["slot1" "slot2" "slot3" "slot4"],
                                                                :type      "vars-var-provider",
                                                                :from-var  [{:var-name "current-player", :to-vector true, :action-property "exclude-values"}],
                                                                :shuffled  true,
                                                                :variables ["current-target"]}
                                                               {:from      ["slot1" "slot2" "slot3" "slot4"],
                                                                :type      "vars-var-provider",
                                                                :unique    true,
                                                                :from-var  [{:var-name "current-target", :to-vector true, :action-property "exclude-values"}],
                                                                :shuffled  true,
                                                                :variables ["pair-target-1" "pair-target-2" "pair-target-3"]}
                                                               {:type     "set-current-concept",
                                                                :from-var [{:var-name "current-concept", :var-property "concept-name", :action-property "value"}]}],
                                                        :type "sequence-data"}
                                                       {:data
                                                              [{:type       "set-slot",
                                                                :target     "display",
                                                                :from-var   [{:var-name "current-concept", :var-property "image-src", :action-property "image"}],
                                                                :slot-name  "box1",
                                                                :attachment {:x 40, :scale-x 4, :scale-y 4}}
                                                               {:to       ["letter1" "letter2" "letter3" "letter4"],
                                                                :from     ["player1" "player2" "player3" "player4"],
                                                                :type     "map-value",
                                                                :from-var [{:var-name "current-target", :action-property "value"}],
                                                                :var-name "target-letter"}
                                                               {:type      "set-attribute",
                                                                :from-var
                                                                           [{:var-name "target-letter", :action-property "target"}
                                                                            {:var-name "current-concept", :var-property "letter", :action-property "attr-value"}],
                                                                :attr-name "text"}
                                                               {:to       ["letter1" "letter2" "letter3" "letter4"],
                                                                :from     ["player1" "player2" "player3" "player4"],
                                                                :type     "map-value",
                                                                :from-var [{:var-name "pair-target-1", :action-property "value"}],
                                                                :var-name "target-letter"}
                                                               {:type      "set-attribute",
                                                                :from-var
                                                                           [{:var-name "target-letter", :action-property "target"}
                                                                            {:var-name "pair-concept-1", :var-property "letter", :action-property "attr-value"}],
                                                                :attr-name "text"}
                                                               {:to       ["letter1" "letter2" "letter3" "letter4"],
                                                                :from     ["player1" "player2" "player3" "player4"],
                                                                :type     "map-value",
                                                                :from-var [{:var-name "pair-target-2", :action-property "value"}],
                                                                :var-name "target-letter"}
                                                               {:type      "set-attribute",
                                                                :from-var
                                                                           [{:var-name "target-letter", :action-property "target"}
                                                                            {:var-name "pair-concept-2", :var-property "letter", :action-property "attr-value"}],
                                                                :attr-name "text"}
                                                               {:to       ["letter1" "letter2" "letter3" "letter4"],
                                                                :from     ["player1" "player2" "player3" "player4"],
                                                                :type     "map-value",
                                                                :from-var [{:var-name "pair-target-3", :action-property "value"}],
                                                                :var-name "target-letter"}
                                                               {:type      "set-attribute",
                                                                :from-var
                                                                           [{:var-name "target-letter", :action-property "target"}
                                                                            {:var-name "pair-concept-3", :var-property "letter", :action-property "attr-value"}],
                                                                :attr-name "text"}],
                                                        :type "sequence-data"}]},
                      :renew-pairs
                                               {:type        "lesson-var-provider",
                                                :from        "concepts-all",
                                                :provider-id "pairs-set",
                                                :shuffled    true,
                                                :variables   ["pair-1" "pair-2" "pair-3" "pair-4" "pair-5" "pair-6" "pair-7" "pair-8" "pair-9" "pair-10"]},
                      :renew-words
                                               {:type        "lesson-var-provider",
                                                :from        "concepts-group",
                                                :limit       3,
                                                :provider-id "words-set",
                                                :repeat      4,
                                                :shuffled    true,
                                                :variables   ["item-1" "item-2" "item-3" "item-4" "item-5" "item-6" "item-7" "item-8" "item-9" "item-10"]},
                      :start-scene
                                               {:type "sequence",
                                                :data
                                                      ["start-activity"
                                                       "init-slots"
                                                       "init-first-player"
                                                       "init-audio-correct"
                                                       "init-audio-try-again"
                                                       "renew-words"
                                                       "renew-pairs"
                                                       "renew-current-concept"
                                                       "mari-welcome-audio"
                                                       "voice-high-var"]},
                      :start-activity          {:type "start-activity", :id "volleyball-letters"},
                      :stop-activity           {:type "stop-activity", :id "volleyball-letters"},
                      :throw
                                               {:type "sequence-data",
                                                :data
                                                      [{:type "action", :from-var [{:template "animate-throw-%", :var-name "current-player", :action-property "id"}]}
                                                       {:id "visible", :type "state", :target "ball-image"}
                                                       {:type "empty", :duration 200}
                                                       {:data
                                                              [{:data
                                                                      [{:type "action", :from-var [{:template "throw-from-%", :var-name "current-player", :action-property "id"}]}
                                                                       {:id "hidden", :type "state", :target "ball-image"}],
                                                                :type "sequence-data"}
                                                               {:data
                                                                      [{:type "empty", :duration 700}
                                                                       {:type        "action",
                                                                        :from-params [{:template "animate-catch-%", :param-property "player", :action-property "id"}]}],
                                                                :type "sequence-data"}],
                                                        :type "parallel"}
                                                       {:type        "set-variable",
                                                        :var-name    "current-player",
                                                        :from-params [{:param-property "player", :action-property "var-value"}]}
                                                       {:id "renew-current-concept", :type "action"}
                                                       {:id "voice-high-var", :type "action"}]},
                      :throw-from-player1
                                               {:type "action", :from-params [{:template "throw-player1-%", :param-property "player", :action-property "id"}]},
                      :throw-from-player2
                                               {:type "action", :from-params [{:template "throw-player2-%", :param-property "player", :action-property "id"}]},
                      :throw-from-player3
                                               {:type "action", :from-params [{:template "throw-player3-%", :param-property "player", :action-property "id"}]},
                      :throw-from-player4
                                               {:type "action", :from-params [{:template "throw-player4-%", :param-property "player", :action-property "id"}]},
                      :throw-player1-player2
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1272, :y 487} {:x 1376, :y 451} {:x 1538, :y 801}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player1-player3
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1066, :y 284} {:x 960, :y 253} {:x 213, :y 940}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player1-player4
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1066, :y 284} {:x 960, :y 253} {:x 528, :y 799}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player2-player1
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1472, :y 487} {:x 1376, :y 451} {:x 1163, :y 941}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player2-player3
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1066, :y 284} {:x 960, :y 253} {:x 213, :y 940}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player2-player4
                                               {:type          "transition",
                                                :to            {:bezier [{:x 1066, :y 284} {:x 960, :y 253} {:x 528, :y 799}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player3-player1
                                               {:type          "transition",
                                                :to            {:bezier [{:x 866, :y 284} {:x 960, :y 253} {:x 1163, :y 941}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player3-player2
                                               {:type          "transition",
                                                :to            {:bezier [{:x 866, :y 284} {:x 960, :y 253} {:x 1538, :y 801}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player3-player4
                                               {:type          "transition",
                                                :to            {:bezier [{:x 246, :y 551} {:x 346, :y 451} {:x 528, :y 799}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player4-player1
                                               {:type          "transition",
                                                :to            {:bezier [{:x 866, :y 284} {:x 960, :y 253} {:x 1163, :y 941}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player4-player2
                                               {:type          "transition",
                                                :to            {:bezier [{:x 866, :y 284} {:x 960, :y 253} {:x 1538, :y 801}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :throw-player4-player3
                                               {:type          "transition",
                                                :to            {:bezier [{:x 446, :y 551} {:x 346, :y 451} {:x 213, :y 940}], :duration 1.4},
                                                :transition-id "ball-transition"},
                      :voice-high-var          {:phrase             :concept-chant
                                                :phrase-description "Concept chant"
                                                :type               "action",
                                                :from-var           [{:var-name "current-concept", :var-property "mari-sound-3"}]},
                      :wait-for-box-animations {:type "empty", :duration 500}
                      :init-audio-correct      {:type "sequence-data"
                                                :data [{:type "set-variable" :var-name "audio-correct1" :var-value "mari-audio-correct-1"}
                                                       {:type "set-variable" :var-name "audio-correct2" :var-value "mari-audio-correct-2"}
                                                       {:type "set-variable" :var-name "audio-correct3" :var-value "mari-audio-correct-3"}
                                                       {:type "set-variable" :var-name "audio-correct4" :var-value "mari-audio-correct-4"}
                                                       {:type "set-variable" :var-name "audio-correct5" :var-value "mari-audio-correct-5"}]}

                      :init-audio-try-again    {:type "sequence-data"
                                                :data [{:type "set-variable" :var-name "audio-try-again1" :var-value "mari-audio-try-again-1"}
                                                       {:type "set-variable" :var-name "audio-try-again2" :var-value "mari-audio-try-again-2"}]}

                      :mari-correct            {:phrase             :correct-answer
                                                :phrase-description "Correct answer"
                                                :type               "sequence-data"
                                                :data               [{:type "action" :id "init-audio-correct"}
                                                                     {:type      "vars-var-provider"
                                                                      :variables ["current-audio-correct"]
                                                                      :from      ["audio-correct1" "audio-correct2" "audio-correct3" "audio-correct4" "audio-correct5"]
                                                                      :shuffled  true}
                                                                     {:type "action" :from-var [{:var-name        "current-audio-correct" :action-property "id"
                                                                                                 :possible-values [:mari-audio-correct-1
                                                                                                                   :mari-audio-correct-2
                                                                                                                   :mari-audio-correct-3
                                                                                                                   :mari-audio-correct-4
                                                                                                                   :mari-audio-correct-5]}]}]}

                      :mari-wrong              {:phrase             :wrong-answer
                                                :phrase-description "Wrong answer"
                                                :type               "sequence-data"
                                                :data               [{:type "action" :id "init-audio-try-again"}
                                                                     {:type      "vars-var-provider"
                                                                      :variables ["current-audio-try-again"]
                                                                      :from      ["audio-try-again1" "audio-try-again2"]
                                                                      :shuffled  true}
                                                                     {:type "action" :from-var [{:var-name        "current-audio-try-again" :action-property "id"
                                                                                                 :possible-values [:mari-audio-try-again-1
                                                                                                                   :mari-audio-try-again-2]}]}]}

                      :mari-audio-correct-1    {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      0.858,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       0.858,
                                                :duration    1.837,
                                                :data        [{:start 1.052, :end 2.505, :duration 1.453, :anim "talk"}],
                                                :phrase-text "That’s correct!"}

                      :mari-audio-correct-2    {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      4.697,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       4.697,
                                                :duration    1.358,
                                                :data        [{:start 4.867, :end 5.926, :duration 1.059, :anim "talk"}],
                                                :phrase-text "Good job!"}

                      :mari-audio-correct-3    {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      7.949,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       7.949,
                                                :duration    1.345,
                                                :data        [{:start 8.066, :end 9.098, :duration 1.032, :anim "talk"}],
                                                :phrase-text "Well done!"}

                      :mari-audio-correct-4    {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      10.997,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       10.997,
                                                :duration    1.147,
                                                :data        [{:start 11.119, :end 11.964, :duration 0.845, :anim "talk"}],
                                                :phrase-text "You got it!"}

                      :mari-audio-correct-5    {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      14.463,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       14.463,
                                                :duration    2.333,
                                                :data        [{:start 14.611, :end 15.11, :duration 0.499, :anim "talk"}
                                                              {:start 15.529, :end 16.676, :duration 1.147, :anim "talk"}],
                                                :phrase-text "Wow, excelent!"}

                      :mari-audio-try-again-1  {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      18.915,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       18.915,
                                                :duration    1.493,
                                                :data        [{:start 18.983, :end 20.242, :duration 1.259, :anim "talk"}],
                                                :phrase-text "Try again!"}

                      :mari-audio-try-again-2  {:type        "animation-sequence",
                                                :target      "mari",
                                                :track       1,
                                                :offset      22.155,
                                                :audio       "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                :start       22.155,
                                                :duration    3.025,
                                                :data        [{:start 23.743, :end 25.055, :duration 1.312, :anim "talk"}],
                                                :phrase-text "Hmmmm. Try again."}},
           :triggers {:back {:on "back", :action "stop-activity"}, :start {:on "start", :action "start-scene"}},
           :metadata {:prev "stadium", :autostart true}})

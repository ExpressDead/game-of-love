(ns game-of-love.predictions
  (:gen-class))

(def true-love-cypher
  [78 101 118 101 114 32 103 111 110 110 97 32 103 105 118 101 32 121 111 117 32 117 112 10 78 101 118 101 114 32 103 111 110 110 97 32 108 101 116 32 121 111 117 32 100 111 119 110 10 78 101 118 101 114 32 103 111 110 110 97 32 114 117 110 32 97 114 111 117 110 100 32 97 110 100 32 100 101 115 101 114 116 32 121 111 117 10 78 101 118 101 114 32 103 111 110 110 97 32 109 97 107 101 32 121 111 117 32 99 114 121 10 78 101 118 101 114 32 103 111 110 110 97 32 115 97 121 32 103 111 111 100 98 121 101 10 78 101 118 101 114 32 103 111 110 110 97 32 116 101 108 108 32 97 32 108 105 101 32 97 110 100 32 104 117 114 116 32 121 111 117 ])

(def message-pretext
  [99 111 109 109 105 116 34 2343 5454 969 3939 44 ])


(defn thought-decoder
  [cnt]
  (let [thought-cypher (apply str (map char (take cnt message-pretext)))]
    (case thought-cypher
      "commit" (apply str (map char [65 32 102 117 108 108 32 99 111 109 109 105 116 109 101 110 116 39 115 32 119 104 97 116 32 73 39 109 32 116 104 105 110 107 105 110 103 32 111 102 ]))
      "fling" (apply str (map char [73 116 39 115 32 106 117 115 116 32 97 32 113 117 105 99 107 32 108 105 116 116 108 101 32 116 104 105 110 103 ]))
      "not interested" (apply str (map char [89 111 117 32 100 111 110 39 116 32 101 118 101 110 32 107 110 111 119 32 116 104 105 115 32 105 115 32 102 105 108 108 101 114 44 32 104 117 104 63 ])))))

(defn rules-engine
  [rules-known]
  (if (= rules-known true)
    (println (apply str (map char [89 111 117 32 107 110 111 119 32 116 104 101 32 114 117 108 101 115 32 97 110 100 32 115 111 32 100 111 32 73 46 ]))) 
    (println (apply str (map char [82 117 108 101 115 32 111 102 32 108 111 118 101 32 109 117 115 116 32 98 101 32 100 101 102 105 110 101 100 ])))))

(defn determinate-individuality
  [unique]
  (if (= unique true)
    (println (apply str (map char [89 111 117 32 119 111 117 108 100 32 110 111 116 32 103 101 116 32 116 104 105 115 32 102 114 111 109 32 97 110 111 116 104 101 114 32 103 117 121 46 ])))
    (println (apply str (map char [84 104 105 115 32 103 117 121 32 104 97 115 32 110 111 116 104 105 110 103 32 117 110 105 113 117 101 32 116 111 32 111 102 102 101 114 ])))))

(defn message-generator
  [message-type]
  (case message-type
    "regrets" (println "I didn't mean to make you fall in love")
    "future" (println "Not now, but some day I could love you")
    "past" (println "Why can't it be like is was before?")
    "feels" (println "I just wanna tell you how I'm feeling")
    "default" (println "I don't know how I feel"))
  (println "Gotta make you understand")
  (println (apply str (map char true-love-cypher))))

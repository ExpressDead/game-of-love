(ns game-of-love.core
  (:gen-class)
  (:require [game-of-love.predictions :as predict]))

(defn game-of-love
  [lover]
  (if (= (get lover :dedicated) true)
    (do
      (println "We're no strangers to love.")
      (predict/rules-engine (get lover :basic-rules))
      (println (predict/thought-decoder (get lover :thoughts)))))
  (predict/determinate-individuality (get lover :uniqueness))
  (predict/message-generator (get lover :message-type)))
 
(defn -main
  [& args]
  (game-of-love {:dedicated true
                 :basic-rules true
                 :thoughts 6
                 :uniqueness 45
                 :message-type "feels"}))

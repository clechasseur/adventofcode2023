(ns adventofcode.y2023.d8
  (:require [adventofcode.y2023.input.d8 :refer [input]]
            [clojure.math.numeric-tower :refer [lcm]]))

(def dir-fns
  {\L first \R second})

(def starting-points
  (filter #(= (last %) \A) (keys (:paths input))))

(defn done?
  [pos]
  (= (last pos) \Z))

(defn moves
  []
  (cycle (:moves input)))

(defn dest
  [from move]
  ((dir-fns move) ((:paths input) from)))

(defn path-len
  [start]
  (->> (moves)
       (reductions dest start)
       (take-while #(not (done? %)))
       count))

(defn part-1
  []
  (path-len "AAA"))

(defn part-2
  []
  (reduce lcm (map path-len starting-points)))

(ns github.io.clechasseur.adventofcode.y2023.d11
  (:require [github.io.clechasseur.adventofcode.y2023.input.d11 :refer [input]]
            [github.io.clechasseur.adventofcode.util.grid :as grid]
            [github.io.clechasseur.adventofcode.util.pt :as pt]
            [clojure.math.combinatorics :as combo]
            [clojure.string :as str]))

(defn expand-line
  ([line]
   (expand-line 2 line))
  ([exp line]
   (if (every? (partial = \.) line)
     (repeat exp line)
     [line])))

(defn expand-universe
  ([universe]
   (expand-universe 2 universe))
  ([exp universe]
   (->> universe
        (mapcat (partial expand-line exp))
        (apply map vector)
        (mapcat expand-line)
        (apply map vector)
        (mapv str/join))))

(defn stars
  [universe]
  (grid/locate (partial = \#) universe))

(defn part-1
  []
  (->> input
       expand-universe
       stars
       (#(combo/combinations % 2))
       (map (partial apply pt/manhattan))
       (reduce +)))

(defn part-2
  []
  23)

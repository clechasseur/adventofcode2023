(ns github.io.clechasseur.adventofcode.y2023.d10
  (:require [github.io.clechasseur.adventofcode.y2023.input.d10 :as d10-input]
            [github.io.clechasseur.adventofcode.util.pt :as pt]
            [github.io.clechasseur.adventofcode.util.grid :as grid]
            [github.io.clechasseur.adventofcode.util.dij :as dij]))

(def input (:map d10-input/input))
(def starting-point
  (->> (map-indexed
         (fn [y line]
           (->> (map-indexed
                 (fn [x c]
                   [[x y] c])
                 line)
                (filter #(= (second %) \S))
                first
                first))
         input)
       (filter some?)
       first))
(def start-is (:start-is d10-input/input))

(defn grid-get
  [pt]
  (let [c (grid/get input pt)]
    (if (= c \S) start-is c)))

(def surroundings
  {[0 -1] {:from #{\L \| \J} :to #{\7 \| \F}}
   [-1 0] {:from #{\J \- \7} :to #{\L \- \F}}
   [ 1 0] {:from #{\L \- \F} :to #{\7 \- \J}}
   [ 0 1] {:from #{\7 \| \F} :to #{\J \| \L}}})

(defn get-neighbour
  [pt [pt-diff {from :from to :to}]]
  (let [c (grid-get pt)
        n-pt (pt/+ pt pt-diff)
        n (grid-get n-pt)]
    (when (and (contains? from c) (contains? to n))
      n-pt)))

(defn neighbours
  [pt]
  (->> surroundings
       (map (partial get-neighbour pt))
       (filter some?)))

(def dij
  (memoize (partial dij/build starting-point neighbours)))

(defn part-1
  []
  (let [{dist :dist} (dij)]
    (->> dist
         (sort-by #(get % 1))
         reverse
         first
         second)))

(defn part-2
  []
  23)

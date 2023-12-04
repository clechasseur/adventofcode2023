(ns adventofcode.util.pt
  (:require [clojure.math.combinatorics :as combo])
  (:refer-clojure :exclude [+ -]))

(def + (partial mapv clojure.core/+))
(def - (partial mapv clojure.core/-))

(defn neighbours
  "Returns all points that are neighbours of the provided point. Works for any number of dimensions."
  [pt]
  (->> (repeat (count pt) '[-1 0 1])
       (apply combo/cartesian-product)
       (filter #(not-every? (partial = 0) %))
       (map (partial + pt))))

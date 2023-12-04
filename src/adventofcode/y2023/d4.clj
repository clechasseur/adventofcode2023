(ns adventofcode.y2023.d4
  (:require [adventofcode.y2023.input.d4 :as d4-i]
            [clojure.set :refer [intersection]]
            [clojure.math :refer [pow]]))

(defn- card
  [card-num]
  (first (filter #(= card-num (:card %)) d4-i/input)))

(defn- num-winners
  [{win-nums :winning-numbers nums :numbers}]
  (count (intersection win-nums nums)))

(defn part-1
  []
  (->> d4-i/input
       (map #(int (pow 2 (dec (num-winners %)))))
       (apply +)))

(defn part-2
  []
  (let [copies (loop [copies {}
                      card-num (:card (last d4-i/input))]
                 (if (zero? card-num)
                   copies
                   (recur
                     (let [num-winners (num-winners (card card-num))
                           won-cards (->> (range (inc card-num) (+ card-num num-winners 1))
                                          (map copies)
                                          (filter some?)
                                          (apply +)
                                          inc)]
                       (assoc copies card-num won-cards))
                     (dec card-num))))]
    (apply + (vals copies))))

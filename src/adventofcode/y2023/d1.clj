(ns adventofcode.y2023.d1
  (:require [adventofcode.y2023.input.d1 :as d1-i]
            [clojure.string :as str]))

(def ^:private numbers-identity-map
  (->> (range 1 10)
       (map str)
       (map #(vector % %))
       (into (sorted-map))))
(def ^:private numbers-as-str
  ["one" "two" "three" "four" "five" "six" "seven" "eight" "nine"])
(def ^:private numbers-as-str-map
  (zipmap numbers-as-str (range 1 10)))

(defn- num-map-to-re
  [num-map]
  (re-pattern (str/join "|" (keys num-map))))

(defn- calibration-value
  [artistic input]
  (let [num-map (if artistic
                  (conj numbers-identity-map numbers-as-str-map)
                  numbers-identity-map)
        rev-map (->> num-map
                     (map #(vector (str/reverse (first %)) (second %)))
                     (into (sorted-map)))
        num-re (num-map-to-re num-map)
        rev-re (num-map-to-re rev-map)
        first-digit (num-map (re-find num-re input))
        last-digit (rev-map (re-find rev-re (str/reverse input)))]
    (Integer/parseInt (str first-digit last-digit))))

(defn- sum-of-calibration-values
  [artistic]
  (apply + (map (partial calibration-value artistic) d1-i/input)))

(defn part-1 [] (sum-of-calibration-values false))
(defn part-2 [] (sum-of-calibration-values true))

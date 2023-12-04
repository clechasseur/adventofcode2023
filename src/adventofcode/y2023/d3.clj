(ns adventofcode.y2023.d3
  (:require [adventofcode.y2023.input.d3 :as d3-input]))

(defn- safe-subs
  [s start end]
  (let [start (max start 0)
        end (min end (count s))]
    (subs s start end)))

(def ^:private neighbours
  [[-1 -1] [0 -1] [1 -1]
   [-1  0]        [1  0]
   [-1  1] [0  1] [1  1]])

(defn- nums-around
  [row-idx col-idx]
  (->> neighbours
       (map #(map + [col-idx row-idx] %))
       (map
         (fn [[x y]]
           (when-let [row (get d3-input/engine-input y)]
             (when (and (>= x 0) (< x (count row)) (Character/isDigit ^char (get row x)))
               (let [start (loop [x x]
                            (if (or (< x 0) (not (Character/isDigit ^char (get row x))))
                              (inc x)
                              (recur (dec x))))
                     end (loop [x (inc start)]
                           (if (or (>= x (count row)) (not (Character/isDigit ^char (get row x))))
                             x
                             (recur (inc x))))]
                 (Integer/parseInt (subs row start end)))))))
       (filter some?)
       distinct))

(defn part-1
  []
  (->> (range (count d3-input/engine-input))
       (map
         (fn [row-idx]
           (let [row (get d3-input/engine-input row-idx)
                 m (re-matcher #"\d+" row)]
             (loop [nums []]
               (let [found (.find m)]
                 (if-not found
                   nums
                   (let [num-start (.start m)
                         num-end (.end m)
                         above-num (if-let [prev-row (get d3-input/engine-input (dec row-idx))]
                                     (safe-subs prev-row (dec num-start) (inc num-end))
                                     "")
                         below-num (if-let [next-row (get d3-input/engine-input (inc row-idx))]
                                     (safe-subs next-row (dec num-start) (inc num-end))
                                     "")
                         before-num (if-let [before (get row (dec num-start))] (str before) "")
                         after-num (if-let [after (get row num-end)] (str after) "")
                         all (str above-num below-num before-num after-num)]
                     (if (re-find #"[^\d.]" all)
                       (recur (conj nums (Integer/parseInt (re-groups m))))
                       (recur nums)))))))))
       flatten
       (apply +)))

(defn part-2
  []
  (->> (range (count d3-input/engine-input))
       (map
         (fn [row-idx]
           (let [row (get d3-input/engine-input row-idx)
                 m (re-matcher #"\*" row)]
             (loop [gears []]
               (let [found (.find m)]
                 (if-not found
                   gears
                   (let [col-idx (.start m)
                         around (nums-around row-idx col-idx)]
                     (if (= (count around) 2)
                       (recur (conj gears (apply * around)))
                       (recur gears)))))))))
       flatten
       (apply +)))
(ns adventofcode.test.y2023.d6
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d6 :as d6-s]))

(deftest part1
  (testing "Day 6 part 1"
    (let [value (d6-s/part-1)]
      (is (= value 449550)))))
(deftest part2
  (testing "Day 6 part 2"
    (let [value (d6-s/part-2)]
      (is (= value 28360140)))))

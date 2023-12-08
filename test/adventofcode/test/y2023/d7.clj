(ns adventofcode.test.y2023.d7
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d7 :as d7-s]))

(deftest part1
  (testing "Day 7 part 1"
    (let [value (d7-s/part-1)]
      (is (= value 251136060)))))
(deftest part2
  (testing "Day 7 part 2"
    (let [value (d7-s/part-2)]
      (is (= value 249400220)))))

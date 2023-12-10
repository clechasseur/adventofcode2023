(ns adventofcode.test.y2023.d3
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d03 :as d3-s]))

(deftest part1
  (testing "Day 3 part 1"
    (let [value (d3-s/part-1)]
      (is (= value 512794)))))
(deftest part2
  (testing "Day 3 part 2"
    (let [value (d3-s/part-2)]
      (is (= value 67779080)))))

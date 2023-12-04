(ns adventofcode.test.y2023.d2
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d2 :as d2-s]))

(deftest part1
  (testing "Day 2 part 1"
    (let [value (d2-s/part-1)]
      (is (= value 2377)))))
(deftest part2
  (testing "Day 2 part 2"
    (let [value (d2-s/part-2)]
      (is (= value 71220)))))

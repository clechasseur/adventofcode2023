(ns adventofcode.test.y2023.d6
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d06 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 6 part 1"
    (let [value (part-1)]
      (is (= value 449550)))))
(deftest part2
  (testing "Day 6 part 2"
    (let [value (part-2)]
      (is (= value 28360140)))))

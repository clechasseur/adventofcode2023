(ns adventofcode.test.y2023.d1
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d01 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 1 part 1"
    (let [value (part-1)]
      (is (= value 55816)))))
(deftest part2
  (testing "Day 1 part 2"
    (let [value (part-2)]
      (is (= value 54980)))))

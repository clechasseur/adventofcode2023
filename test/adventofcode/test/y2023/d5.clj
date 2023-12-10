(ns adventofcode.test.y2023.d5
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d05 :as d5-s]))

(deftest part1
  (testing "Day 5 part 1"
    (let [value (d5-s/part-1)]
      (is (= value 650599855)))))
(deftest part2
  (testing "Day 5 part 2"
    (let [value (d5-s/part-2)]
      (is (= value 1240035)))))

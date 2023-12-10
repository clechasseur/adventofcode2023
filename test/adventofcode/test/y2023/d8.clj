(ns adventofcode.test.y2023.d8
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d08 :as d8-s]))

(deftest part1
  (testing "Day 8 part 1"
    (let [value (d8-s/part-1)]
      (is (= value 12083)))))
(deftest part2
  (testing "Day 8 part 2"
    (let [value (d8-s/part-2)]
      (is (= value 13385272668829)))))

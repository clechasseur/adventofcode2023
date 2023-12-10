(ns adventofcode.test.y2023.d8
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d08 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 8 part 1"
    (let [value (part-1)]
      (is (= value 12083)))))
(deftest part2
  (testing "Day 8 part 2"
    (let [value (part-2)]
      (is (= value 13385272668829)))))

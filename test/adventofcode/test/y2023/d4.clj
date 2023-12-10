(ns adventofcode.test.y2023.d4
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d04 :as d4-s]))

(deftest part1
  (testing "Day 4 part 1"
    (let [value (d4-s/part-1)]
      (is (= value 28750)))))
(deftest part2
  (testing "Day 4 part 2"
    (let [value (d4-s/part-2)]
      (is (= value 10212704)))))

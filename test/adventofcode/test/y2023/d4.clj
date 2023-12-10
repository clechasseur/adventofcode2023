(ns adventofcode.test.y2023.d4
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d04 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 4 part 1"
    (let [value (part-1)]
      (is (= value 28750)))))
(deftest part2
  (testing "Day 4 part 2"
    (let [value (part-2)]
      (is (= value 10212704)))))

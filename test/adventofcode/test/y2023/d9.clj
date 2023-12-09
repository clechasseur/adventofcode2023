(ns adventofcode.test.y2023.d9
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d9 :as d9-s]))

(deftest part1
  (testing "Day 9 part 1"
    (let [value (d9-s/part-1)]
      (is (= value 1798691765)))))
(deftest part2
  (testing "Day 9 part 2"
    (let [value (d9-s/part-2)]
      (is (= value 1104)))))

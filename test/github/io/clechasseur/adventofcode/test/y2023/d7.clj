(ns github.io.clechasseur.adventofcode.test.y2023.d7
  (:require [clojure.test :refer :all]
            [github.io.clechasseur.adventofcode.y2023.d07 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 7 part 1"
    (let [value (part-1)]
      (is (= value 251136060)))))
(deftest part2
  (testing "Day 7 part 2"
    (let [value (part-2)]
      (is (= value 249400220)))))

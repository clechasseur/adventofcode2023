(ns github.io.clechasseur.adventofcode.test.y2023.d9
  (:require [clojure.test :refer :all]
            [github.io.clechasseur.adventofcode.y2023.d09 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 9 part 1"
    (let [value (part-1)]
      (is (= value 1798691765)))))
(deftest part2
  (testing "Day 9 part 2"
    (let [value (part-2)]
      (is (= value 1104)))))

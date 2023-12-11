(ns ^:slow github.io.clechasseur.adventofcode.test.y2023.d10
  (:require [clojure.test :refer :all]
            [github.io.clechasseur.adventofcode.y2023.d10 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 10 part 1"
    (let [value (part-1)]
      (is (= value 6842)))))
(deftest part2
  (testing "Day 10 part 2"
    (let [value (part-2)]
      (is (= value 23)))))

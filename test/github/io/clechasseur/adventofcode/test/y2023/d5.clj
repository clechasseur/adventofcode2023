(ns github.io.clechasseur.adventofcode.test.y2023.d5
  (:require [clojure.test :refer :all]
            [github.io.clechasseur.adventofcode.y2023.d05 :refer [part-1 part-2]]))

(deftest part1
  (testing "Day 5 part 1"
    (let [value (part-1)]
      (is (= value 650599855)))))
(deftest part2
  (testing "Day 5 part 2"
    (let [value (part-2)]
      (is (= value 1240035)))))

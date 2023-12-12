(ns io.github.clechasseur.adventofcode.test.y2023.d11
  (:require [clojure.test :refer :all]
            [io.github.clechasseur.adventofcode.y2023.d11 :refer [part-1 part-2]]))

(deftest part1
  (print "Day 11 part 1 ")
  (time
    (let [value (part-1)]
      (is (= value 9445168)))))
(deftest part2
  (print "Day 11 part 2 ")
  (time
    (let [value (part-2)]
      (is (= value 742305960572)))))

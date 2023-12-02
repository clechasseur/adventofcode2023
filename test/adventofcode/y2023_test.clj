(ns adventofcode.y2023-test
  (:require [clojure.test :refer :all]
            adventofcode.y2023.d1))

(deftest day-1-part-1
  (testing "Day 1 part 1"
    (let [value (adventofcode.y2023.d1/part-1)]
      (is (= value 55816)))))
(deftest day-1-part-2
  (testing "Day 1 part 2"
    (let [value (adventofcode.y2023.d1/part-2)]
      (is (= value 54980)))))

(ns adventofcode.y2023-test
  (:require [clojure.test :refer :all]
            adventofcode.y2023.d1
            adventofcode.y2023.d2
            adventofcode.y2023.d3))

(deftest day-1-part-1
  (testing "Day 1 part 1"
    (let [value (adventofcode.y2023.d1/part-1)]
      (is (= value 55816)))))
(deftest day-1-part-2
  (testing "Day 1 part 2"
    (let [value (adventofcode.y2023.d1/part-2)]
      (is (= value 54980)))))

(deftest day-2-part-1
  (testing "Day 2 part 1"
    (let [value (adventofcode.y2023.d2/part-1)]
      (is (= value 2377)))))
(deftest day-2-part-2
  (testing "Day 2 part 2"
    (let [value (adventofcode.y2023.d2/part-2)]
      (is (= value 71220)))))

(deftest day-3-part-1
  (testing "Day 3 part 1"
    (let [value (adventofcode.y2023.d3/part-1)]
      (is (= value 512794)))))
(deftest day-3-part-2
  (testing "Day 3 part 2"
    (let [value (adventofcode.y2023.d3/part-2)]
      (is (= value 67779080)))))

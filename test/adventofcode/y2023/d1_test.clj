(ns adventofcode.y2023.d1_test
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d1 :as d1]))

(deftest part-1
  (testing "Day 1 part 1"
    (let [value (d1/part-1)]
      (is (= value 55816)))))
(deftest part-2
  (testing "Day 1 part 2"
    (let [value (d1/part-2)]
      (is (= value 54980)))))

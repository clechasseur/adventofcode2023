(ns adventofcode.y2023.d2_test
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d2 :as d2]))

(deftest part-1
  (testing "Day 2 part 1"
    (let [value (d2/part-1)]
      (is (= value 2377)))))
(deftest part-2
  (testing "Day 2 part 2"
    (let [value (d2/part-2)]
      (is (= value 71220)))))

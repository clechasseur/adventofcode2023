(ns adventofcode.y2023.d3_test
  (:require [clojure.test :refer :all]
            [adventofcode.y2023.d3 :as d3]))

(deftest part-1
  (testing "Day 3 part 1"
    (let [value (d3/part-1)]
      (is (= value 512794)))))
(deftest part-2
  (testing "Day 3 part 2"
    (let [value (d3/part-2)]
      (is (= value 67779080)))))

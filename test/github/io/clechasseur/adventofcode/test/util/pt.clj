(ns ^:util github.io.clechasseur.adventofcode.test.util.pt
  (:require [clojure.test :refer :all]
            [github.io.clechasseur.adventofcode.util.pt :as pt]))

(deftest pt-+-two-points
  (testing "+ with two points"
    (let [a '[1 2]
          b '[3 4]
          c (pt/+ a b)]
      (is (= c [4 6])))))
(deftest pt-+-three-points
  (testing "+ with three points"
    (let [a '[1 2 3]
          b '[3 4 5]
          c '[5 6 7]
          d (pt/+ a b c)]
      (is (= d [9 12 15])))))

(deftest pt---two-points
  (testing "- with two points"
    (let [a '[3 4]
          b '[1 2]
          c (pt/- a b)]
      (is (= c [2 2])))))
(deftest pt---three-points
  (testing "- with three points"
    (let [a '[5 6 7]
          b '[3 4 5]
          c '[1 2 3]
          d (pt/- a b c)]
      (is (= d [1 0 -1])))))

(deftest neighbours-pt-2d
  (testing "Get neighbours for 2D point"
    (let [pt '[1 2]
          expected '[[0 1] [1 1] [2 1]
                     [0 2]       [2 2]
                     [0 3] [1 3] [2 3]]
          actual (pt/neighbours pt)]
      (is (= (set actual) (set expected))))))
(deftest neighbours-pt-3d
  (testing "Get neighbours for 3D point"
    (let [pt '[1 2 3]
          expected '[[0 1 2] [1 1 2] [2 1 2]
                     [0 2 2] [1 2 2] [2 2 2]
                     [0 3 2] [1 3 2] [2 3 2]

                     [0 1 3] [1 1 3] [2 1 3]
                     [0 2 3]         [2 2 3]
                     [0 3 3] [1 3 3] [2 3 3]

                     [0 1 4] [1 1 4] [2 1 4]
                     [0 2 4] [1 2 4] [2 2 4]
                     [0 3 4] [1 3 4] [2 3 4]]
          actual (pt/neighbours pt)]
      (is (= (set actual) (set expected))))))

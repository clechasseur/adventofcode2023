(ns ^:util adventofcode.test.util.grid
  (:require [clojure.test :refer :all]
            [adventofcode.util.grid :as grid]))

(def ^:private test-2-grid
  [[1 2 3]
   [4 5 6]
   [7 8 9]])
(def ^:private test-3d-grid
  [[[1 2 3]
    [4 5 6]
    [7 8 9]]
   [[3 2 1]
    [6 5 4]
    [9 8 7]]
   [[7 8 9]
    [4 5 6]
    [1 2 3]]])

(deftest grid-get-2d-all-in-bounds
  (testing "Get point in 2D grid with both x and y in bounds"
    (let [actual (grid/get test-2-grid [1 1])]
      (is (= actual 5)))))
(deftest grid-get-2d-x-out-of-bounrds
  (testing "Get point in 2D grid with x out of bounds"
    (let [actual (grid/get test-2-grid [8 1])]
      (is (nil? actual)))))
(deftest grid-get-2d-y-out-of-bounrds
  (testing "Get point in 2D grid with y out of bounds"
    (let [actual (grid/get test-2-grid [1 8])]
      (is (nil? actual)))))

(deftest grid-get-3d-all-in-bounds
  (testing "Get point in 3D grid with x, y and z in bounds"
    (let [actual (grid/get test-3d-grid [1 1 1])]
      (is (= actual 5)))))
(deftest grid-get-3d-x-out-of-bounds
  (testing "Get point in 3D grid with x out of bounds"
    (let [actual (grid/get test-3d-grid [8 1 1])]
      (is (nil? actual)))))
(deftest grid-get-3d-y-out-of-bounds
  (testing "Get point in 3D grid with y out of bounds"
    (let [actual (grid/get test-3d-grid [1 8 1])]
      (is (nil? actual)))))
(deftest grid-get-3d-z-out-of-bounds
  (testing "Get point in 3D grid with z out of bounds"
    (let [actual (grid/get test-3d-grid [1 1 8])]
      (is (nil? actual)))))

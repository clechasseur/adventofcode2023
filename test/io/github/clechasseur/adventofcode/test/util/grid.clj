(ns ^:util io.github.clechasseur.adventofcode.test.util.grid
  (:require [clojure.test :refer :all]
            [io.github.clechasseur.adventofcode.util.grid :as grid]))

(def test-2d-grid
  [[1 2 3]
   [4 5 6]
   [7 8 9]])
(def test-3d-grid
  [[[1 2 3]
    [4 5 6]
    [7 8 9]]
   [[3 2 1]
    [6 5 4]
    [9 8 7]]
   [[7 8 9]
    [4 5 6]
    [1 2 3]]])

(deftest grid-get
  (testing "Get point in 2D grid with both x and y in bounds"
    (let [actual (grid/get test-2d-grid [1 1])]
      (is (= actual 5))))
  (testing "Get point in 2D grid with x out of bounds"
    (let [actual (grid/get test-2d-grid [8 1])]
      (is (nil? actual))))
  (testing "Get point in 2D grid with y out of bounds"
    (let [actual (grid/get test-2d-grid [1 8])]
      (is (nil? actual))))

  (testing "Get point in 3D grid with x, y and z in bounds"
    (let [actual (grid/get test-3d-grid [1 1 1])]
      (is (= actual 5))))
  (testing "Get point in 3D grid with x out of bounds"
    (let [actual (grid/get test-3d-grid [8 1 1])]
      (is (nil? actual))))
  (testing "Get point in 3D grid with y out of bounds"
    (let [actual (grid/get test-3d-grid [1 8 1])]
      (is (nil? actual))))
  (testing "Get point in 3D grid with z out of bounds"
    (let [actual (grid/get test-3d-grid [1 1 8])]
      (is (nil? actual)))))

(deftest grid-locate
  (testing "Find odd numbers in a 2D grid"
    (let [expected [[0 0]       [2 0]
                          [1 1]
                    [0 2]       [2 2]]
          actual (grid/locate odd? test-2d-grid)]
      (is (= actual expected))))
  (testing "Find a specific number in a 2D grid"
    (let [expected [[2 0]]
          actual (grid/locate (partial = 3) test-2d-grid)]
      (is (= actual expected))))

  (testing "Find odd numbers in a 3D grid"
    (let [expected [[0 0 0]         [2 0 0]
                            [1 1 0]
                    [0 2 0]         [2 2 0]

                    [0 0 1]         [2 0 1]
                            [1 1 1]
                    [0 2 1]         [2 2 1]

                    [0 0 2]         [2 0 2]
                            [1 1 2]
                    [0 2 2]         [2 2 2]]
          expected (set expected)
          actual (set (grid/locate odd? test-3d-grid))]
      (is (= actual expected))))
  (testing "Find specific numbers in a 3D grid"
    (let [expected [[2 0 0] [0 0 1] [2 2 2]]
          expected (set expected)
          actual (set (grid/locate (partial = 3) test-3d-grid))]
      (is (= actual expected)))))

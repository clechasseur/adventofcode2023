(ns adventofcode.util.string_test
  (:require [clojure.test :refer :all]
            [adventofcode.util.string :as str]))

(deftest safe-subs-arity-1-in-bounds
  (testing "safe-subs with start value in bounds"
    (let [s "hello"
          expected "ello"
          actual (str/safe-subs s 1)]
      (is (= actual expected)))))
(deftest safe-subs-arity-2-both-in-bounds
  (testing "safe-subs with start and end values in bounds"
    (let [s "hello"
          expected "ell"
          actual (str/safe-subs s 1 4)]
      (is (= actual expected)))))
(deftest safe-subs-arity-1-out-of-bounds
  (testing "safe-subs with start value out of bounds"
    (let [s "hello"
          expected "hello"
          actual (str/safe-subs s -1)]
      (is (= actual expected)))))
(deftest safe-subs-arity-2-start-out-of-bounds
  (testing "safe-subs with start value out of bounds and end value in bounds"
    (let [s "hello"
          expected "hell"
          actual (str/safe-subs s -1 4)]
      (is (= actual expected)))))
(deftest safe-subs-arity-2-end-out-of-bounds
  (testing "safe-subs with start value in bounds and end value out of bounds"
    (let [s "hello"
          expected "ello"
          actual (str/safe-subs s 1 8)]
      (is (= actual expected)))))
(deftest safe-subs-arity-2-both-out-of-bounds
  (testing "safe-subs with start and end values out of bounds"
    (let [s "hello"
          expected "hello"
          actual (str/safe-subs s -1 8)]
      (is (= actual expected)))))

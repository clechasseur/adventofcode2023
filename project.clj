(defproject io.github.clechasseur.adventofcode.y2023 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2023 solutions from clechasseur"
  :url "https://github.com/clechasseur/adventofcode2023"
  :license {:name "MIT"
            :url "https://github.com/clechasseur/adventofcode2023/blob/main/LICENSE"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/math.combinatorics "0.2.0"]
                 [org.clojure/math.numeric-tower "0.0.5"]
                 [org.clojure/core.async "1.6.681"]]
  :repl-options {:init (do
                         (require '[clojure.math.combinatorics :as combo])
                         (require '[clojure.math.numeric-tower :as tower])
                         (require '[clojure.core.async :as a]))}
  :test-selectors {:default (complement #(or (:slow %) (:util %)))
                   :with-slow (complement :util)
                   :util :util
                   :day (fn [m d]
                          (let [d (str (when (< d 10) "0") d)]
                           (= (str (:ns m)) (str "io.github.clechasseur.adventofcode.test.y2023.d" d))))
                   :puzzle (fn [m d-p]
                             (let [[match d p] (re-matches #"d?([01]?\d|2[012345])/(?:part)?([12])" (str d-p))
                                   d (str (when (= (count d) 1) "0") d)]
                               (assert match "Use this format: dX/partY (day = 1-25, part = 1-2)")
                               (and
                                 (= (str (:ns m)) (str "io.github.clechasseur.adventofcode.test.y2023.d" d))
                                 (= (str (:name m)) (str "part" p)))))})

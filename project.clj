(defproject adventofcode.y2023 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2023 solutions from clechasseur"
  :url "https://github.com/clechasseur/adventofcode2023"
  :license {:name "MIT"
            :url "https://github.com/clechasseur/adventofcode2023/blob/main/LICENSE"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/math.combinatorics "0.2.0"]]
  :test-selectors {:default (complement :util)
                   :util :util}
  :repl-options {:init (do
                         (use 'adventofcode.util.pt))})

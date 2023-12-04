(ns adventofcode.util.grid
  (:refer-clojure :exclude [get]))

(defn get
  "Gets a value in a grid. Returns nil if any dimension is out of bounds."
  [grid pt]
  (loop [dim (dec (count pt))
         grid grid]
    (when-let [sub-grid (clojure.core/get grid (clojure.core/get pt dim))]
      (if (zero? dim)
        sub-grid
        (recur (dec dim) sub-grid)))))

(ns io.github.clechasseur.adventofcode.util.grid
  (:refer-clojure :exclude [get]))

(defn get
  "Gets a value in a grid. Returns nil if any dimension is out of bounds."
  [grid pt]
  {:pre [(or (empty? pt) (seqable? grid))]}
  (if (empty? pt)
    grid
    (when-let [grid (clojure.core/get grid (last pt))]
      (recur grid (drop-last pt)))))

(defn locate
  "Locates all points in a grid for which `(pred (get pt))` returns true."
  ([pred grid]
   (locate '() pred grid))
  ([pt pred grid]
   (cond
     (seqable? grid) (->> (map-indexed vector grid)
                          (mapcat (fn [[i grid]] (locate (conj pt i) pred grid)))
                          (map (partial apply vector)))
     (pred grid)     (list pt)
     :else           '())))

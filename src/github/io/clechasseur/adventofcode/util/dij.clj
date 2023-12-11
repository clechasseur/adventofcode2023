(ns github.io.clechasseur.adventofcode.util.dij)

(def ^:private inf (Long/MAX_VALUE))

(defn build
  "Implementation of Dijkstra pathfinding algorithm.

  Input is the start node, a function to compute neighbours of a node and (optionally)
  a function to get the distance between two nodes (if not provided, it is assumed all
  nodes are all 1 unit apart).

  Output is a hash map with:
  - :dist => Hash map of nodes to the distance from the starting point
  - :pos  => Hash map of nodes to the previous node along the shortest path to that node"
  ([start neighbours-fn]
   (build start neighbours-fn (constantly 1)))
  ([start neighbours-fn dist-fn]
   (loop [q #{start}
          dist {start 0}
          prev {}]
     (if-let [u (first (sort-by dist q))]
       (let [neighbours (set (neighbours-fn u))
             q (disj (apply conj q (apply disj neighbours (keys dist))) u)
             [dist prev] (reduce
                           (fn [[dist prev] neighbour]
                             (let [neighbour-dist (+ (dist u) (dist-fn u neighbour))]
                               (if (< neighbour-dist (or (dist neighbour) inf))
                                 [(assoc dist neighbour neighbour-dist) (assoc prev neighbour u)]
                                 [dist prev])))
                           [dist prev]
                           neighbours)
             ]
         (recur q dist prev))
       {:dist dist :prev prev}))))

(defn path
  "TODO"
  [_start _end _prev]
  nil)

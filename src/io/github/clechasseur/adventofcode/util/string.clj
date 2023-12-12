(ns io.github.clechasseur.adventofcode.util.string)

(defn safe-subs
  "Safe version of `subs`. If start or end are out of bounds, they will be constrained automatically."
  ([s start]
   (safe-subs s start (count s)))
  ([s start end]
   (let [start (max start 0)
         end (min end (count s))]
     (subs s start end))))

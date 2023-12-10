(ns github.io.clechasseur.adventofcode.y2023.input.d06)

(def input
  (->> {:races [{:time 46 :distance 347}
                {:time 82 :distance 1522}
                {:time 84 :distance 1406}
                {:time 79 :distance 1471}]}
       ((fn [input]
          (let [big-time (bigint (apply str (map :time (:races input))))
                big-distance (bigint (apply str (map :distance (:races input))))]
            (assoc input :big-race {:time big-time :distance big-distance}))))))

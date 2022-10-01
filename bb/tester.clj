(ns bb-test)

(def values (map #(* 2 %) (range 1000)))

(doseq [i values]
       (println (str "Value = " i)))
(ns getting-started)

(defn my-map
  [f coll]
  (if (empty? coll)
    '()
    (cons (f (first coll)) (my-map f (next coll)))))

(println (my-map inc [1 2 3]))
(println (my-map inc []))

(defn my-reduce
  [f default coll]
  (if (empty? coll)
    default
    (reduce f (f default (first coll)) (next coll))))

(println (my-reduce + 5 [1 2 3]))
(println (my-reduce + 1 [2 3 4 5]))

(defn factorial
  [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(println (factorial 5))

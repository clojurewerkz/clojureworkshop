(ns getting-started)

;; Simple Functions

(defn double
  [x]
  (+ x x))

(defn square
  [x]
  (* x x))

(defn cube
  [x]
  (* x x x))

;;
;; Working with sequences
;;

(defn conj-to-list
  [])

(defn conj-to-vector
  [])

;; Check out the tests and see that conjoining to list makes a in a reverse order

(defn add-name
  [m name]
  (assoc :name name))

(defn add-name-and-age
  [m name age]
  (assoc :name name
         :age age))

(defn remove-name
  [m]
  (dissoc m :name))

(defn remove-name-and-age
  [m]
  (dissoc m :name :age))

(defn map-from-keys-and-vals
  [keys vals]
  (zipmap keys vals))

(defn split-head-and-tail
  [list]
  [(first list) (next list)])

(defn split-head-and-tail-destructuring
  [[head & tail]]
  [head tail])

(defn increment-list
  [l]
  (map inc l))

(defn add-5-to-all
  [l]
  (map #(+ 5 %) l))

(defn sum
  [list]
  (reduce + 0 list))

(defn reduce-assoc
  "In this function, use reduce to get a hash map from vector of pairs.

   This example illustrates how to use destructuring"
  [list]
  (assert (even? (count list)) "Number of entries should be even.")
  (reduce (fn [acc [k v]] (assoc acc k v)) {} (partition 2 list)))

(defn even-only
  [l]
  (filter even? l))

(defn odd-only
  [l]
  (remove even? l))

(def custom-odd (complement even?))

(defn sum-of-squares-of-even-numbers
  "This excercise will help you to understand threading operator in Clojure"
  [coll]
  (->> coll
       (filter even?)
       (map square)
       (reduce + 0)))



;; Working with let
(defn average
  [numbers]
  (let [sum   (sum numbers)
        count (count numbers)]
    (/ sum count)))


(defn hi-user
  [name]
  (format "Hi, %s" name))

;;
;; Recursion
;;

(defn factorial
  [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(defn my-map
  [f coll]
  (if (empty? coll)
    '()
    (cons (f (first coll)) (my-map f (next coll)))))

(defn my-filter
  [])

(defn my-reduce
  [f default coll]
  (if (empty? coll)
    default
    (reduce f (f default (first coll)) (next coll))))

(ns fizzbuzz.core)

(defn fizz [x] (= 0 (mod x 3)))
(defn buzz [x] (= 0 (mod x 5)))
(defn fizzbuzz [x] (if (fizz x) (if (buzz x) "fizzbuzz" "fizz") (if (buzz x) "buzz" x)))

(print (map fizzbuzz (range 1 100)))
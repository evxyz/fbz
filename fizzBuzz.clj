(ns fizzBuzz)


(loop [x 100]
  (when (> x 0)

(cond 
   (= 0 (mod x 15))
  (print   "FizzBuzz ")
     (= 0 (mod x 5))
   (print   "Buzz ")
      (= 0 (mod x 3))
    (print   "Fizz ")
        (<= 0 (mod x 2))
      (print x\ ))

  (recur (- x 1))))


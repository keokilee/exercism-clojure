(ns bob (:use [clojure.string :only (upper-case trim lower-case)]))

(defn  response-for [sentence]
  (cond
    (= (count (trim sentence)) 0) "Fine. Be that way!" 
    (and (= sentence (upper-case sentence)) (not (= sentence (lower-case sentence)))) "Whoa, chill out!"
    (= (last sentence) \?) "Sure."
    :else "Whatever."))

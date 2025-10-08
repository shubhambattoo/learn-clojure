(ns hello-world.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"
           ;; (slurp "/usr/share/dict/connectives")
           ))
[1 2 3] ;; vector
{:a 1 :b 2} ;; map
#{:a :b} ;; set
'(1 2 3) ;; list

(println (string/upper-case "hello"))

(def names (string/split-lines (slurp "/usr/share/dict/propernames")))

names

(def mangle
  (fn [string]
    (string/join "-" (string/reverse string))))

;; (println(mangle "hello"))


(defn demangle [mangle-string]
  (string/reverse (string/replace mangle-string "-" "")))

;; (println (demangle "o-l-l-e-h"))


(defn palindrome? [word]
  (let [lower-case (string/lower-case word)
        reversed (string/reverse lower-case)]
    (= reversed lower-case)))

;; (println (palindrome? "eYe"))
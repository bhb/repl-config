(ns repl-config.core
  [rebel-readline.clojure.main])

(defn clj
  []
  (println "Hello, World!")
  (rebel-readline.clojure.main/repl)
  )

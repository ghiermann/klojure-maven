(ns klojure.Core
  (:gen-class
    :name klojure.Core
    :methods [#^{:static true} [run [String] void]]))

(defn run
  "Hello World"
  [x]
  (println "Hey, you are calling clojure from" x "- Nicely done!"))

(defn -run
  "Java wrapper for 'run'"
  [x]
  (run x))
(ns frak-cli.core
  (:gen-class))

(require 'frak)

(defn -main
  "Passes arguments to frak/pattern"
  [& args]
  (alter-var-root #'*read-eval* (constantly false))
  (println (frak/pattern args)))

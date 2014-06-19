(defproject clojure-aleph-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler al.app/my-routes
         :reload-paths ["src"]
         :auto-reload? true}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure "1.5.1"]
                 [aleph "0.3.2"]])

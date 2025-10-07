(defproject hello-world "0.1.0-SNAPSHOT"
  :description "hello world application with clojure"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.2"]]
  :exclusions [nrepl nrepl/nrepl org.nrepl/incomplete]
  :main ^:skip-aot hello-world.core
  :target-path "target/%s")

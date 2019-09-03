(defproject viebel/duct-sentry "0.1.0"
  :description "Integrant methods for capturing error to sentry via raven-clj"
  :url "https://github.com/viebel/duct-sentry"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [integrant "0.6.3"]
                 [raven-clj "1.6.0-alpha3"]])

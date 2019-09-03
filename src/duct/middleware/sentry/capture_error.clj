(ns duct.middleware.sentry.capture-error
  (:require [integrant.core :as ig]
            [raven-clj.ring :refer [wrap-sentry]]))

(defmethod ig/init-key :duct.middleware.sentry/capture-error [_ {:keys [dsn] :as opts}]
  (fn [handler]
    (wrap-sentry handler dsn (dissoc opts :dsn))))

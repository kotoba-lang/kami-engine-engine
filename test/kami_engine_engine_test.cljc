(ns kami_engine_engine-test
  (:require [clojure.test :refer [deftest is testing]]
            [kami_engine_engine]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (find-ns 'kami_engine_engine)))))

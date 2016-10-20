(ns life.core-test
  (:require [clojure.test :refer :all]
            [life.core :refer :all]))

(deftest foo-test
  (testing "foo is reflexive"
    (is (= 5150 (foo 5150)))))

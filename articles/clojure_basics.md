---
title: "Moving forward with Clojure basics"
layout: article
---

## Namespaces

Clojure uses namespaces to organize function names into groups and to
keep them from colliding with other function names. All function names
live in a namespace. All the core functions we've been using thus far
are in the `clojure.core` namespace:

```clj
(clojure.core/println "hi")
```

In order to create your own namespace, use `ns` form, that receives
`:require`, `:use` and `:import`.

`:require` helper form is for setting up access to other Clojure
namespaces from your code. For example:

```clj
(ns my-app
  (:require clojure.pprint))

(clojure.pprint/pprint {:a {:b {:c {:d :e}}}})
```

`:import` helper form is for setting up access to Java classes from your
Clojure code. For example:

```clj
(ns my-app
  (:import [java.util.concurrent Executors TimeUnit]
           java.util.Date))
```

`:use` makes __all__ functions in given namespace available in the
current one.

```clj
(ns my-app.test
  (:use clojure.test))

(deftest my-first-test
  (is (= 1 1)))
```

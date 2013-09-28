---
title: "Getting Started"
layout: article
---

## Getting started with Clojure

No matter which technology you're coming from, or what you're going to
use in future, Clojure will teach you something new, interesting and
useful that will help you to develop better applications in future.

This chapter will cover basic principles of Clojure and help you with

### Why Clojure?

  * Extremely expressive language
  * First-class functions
  * Awesome Java Interop abilities
  * Power of lisp (macros, function composition)
  * FUNctional

### Functional programming

When I first heard of Functional Programming it sounded very
complex. Although it's not. It's as simple as being able to have a
function, and not being able to re-assign the variable. Now it sounds
simplistic, but this simplicity has an amazing power, which you'll
discover during next two days of workshop.

#### Everything is an expression

The simplest example of how Functional Programming style is different
from imperative is conditional statement. In languages like Java you
if you want to have a variable to get one of two values, you'd write
code somewhat similar to:

```java
String parity = null;
if (number % 2 == 0) {
  parity = "even";
} else {
  parity = "odd";
}
```

In Clojure, everything is an expression. If you type `(+ 1 1)`, it's an
expression that adds two numbers, and if you write:

```clojure
(def parity (if (even? number) :even :odd))
```

It evaluates `if` form checking which statement shuld be returned,
`:even` or `:odd`. Everything that you see between two brackets is an
expression that returns some value, therefore most of times you can
avoid additional variables, since you can use conditionals, `let` form,
function calls, every language feature as an expression.

Other examples of expressions would be:

```clj
5                      ; ⇒ 5
"hi"                   ; ⇒ "hi"
[1 2 3]                ; evaluates to the vector `[1 2 3]`
(+ 1 2)                ; evaluates to the sum of 1 and 2
(if true "yes" "no")   ; evaluates to the string "yes"
(println "hello!")     ; evaluates to nil (but also prints "hello!")
```

### Iteration

If you want to take an array of numbers `[1,2,3]` and increment it,
you'd have to either create a new array holding incremented values or
increment values in-place.

```java
int [] arr = {1,2,3};

for(int i = 0; i < arr.length; i++){
  arr[i] = i + 1;
}
```

This has many downsides. One of them is that if you're currently located
inside the function and only hold a reference to the array, you're not
guaranteed that array doesn't change during the iteration. Moreover, if
you're incrementing in-place, you may be breaking code that relies on
the fact that array is unchanged.

In Clojure, you don't have this problem, because you can't re-assign the
value, and you can't change the values inside of the array. So you can
only map through all the values within the array, increment each one of
them and return a new array:

```clj
(map inc [1 2 3])
```

Some languages have implementation of `map` for Enumerables, but in many
of them internally it's implemented exactly as we've seen above: new
array is created empty, filled with new values and then returned. In
functional programming languages it's usually created through recursive
function that's taking the head (first element of the array), applying
function to it, then it recurses to itself with newly calculated array
and to-be-calculated one.

### Enter Clojure

We'll start with evaluating simple things in Repl and move to more
complex things, creating your first namespace and writing a set of
functions later. Now, we're going to cover the foundation.

#### Variables

Even though Variables are called that way, you don't really change
them. E.g. usually you don't solve problem in Clojure by re-assigning a
variable. In principle, you can rebind the variable, or shadow it in a
lexical scope, but these all are just flexibility matters.

In order to define a new variable, you use `def` form:

```clj
(def a 1)
```

Since there on, you can reference it by name `a` within current
namespace. Let's try it out in REPL.

#### Expressions

As we've mentioned before, everything gets evaluated as an expression.

```clj
(def a (+ 1 (* 2 2)))
```

Here, you can see 3 expressions: `(* 2 2)`, `(+ 1 (* 2 2)`, and def
itself. If you evaluate any expression in REPL, you'll get it's final
result. Try it out now.

#### Data Structures

Clojure comes out of the box with nice literal syntax for the various
core data structures:

```clj
[1 2 3]            ; A vector (can access items by index).
[1 :two "three"]   ; Put anything into them you like.
{:a 1 :b 2}        ; A hashmap (or just "map", for short).
```

A hashmap is your typical hash/dictionary data structure. In the above
example, the keys are :a and :b, and the values are 1 and 2. One
key-value pair in a map is called an entry.

Although it's most common to use keywords (as shown above) for hashmap
keys, you can use any values you like for the keys as well as the
values.

```clj
#{:a :b :c}        ; A set (unordered, and contains no duplicates).
'(1 2 3)           ; A list (linked-list)
```

Note: In Clojure, we use the term "vector" rather than "array". "Array"
would refer to the native Java array, whereas "vector" refers to the
Clojure data structure.

Try creating a list, vector, map and set in your REPL now.

#### Functions

In order to define a function, you use `defn` form. For example, lets
create a function that adds two values:

```clj
(defn sum-of-two-numbers
  [a b]
  (+ a b)
```

Since now on yu can use `sum-of-two-numbers` name to call the function:

```clj
(sum-of-two-numbers 2 3)
;; => 5
```

#### Anonymous functions

In order to create an anonymous function, you can use `fn` form or `#()`
shortcut:

```clj
(fn [a b] (+ a b))
```

You can call an anonymous function right away:

```clj
((fn [a b] (+ a b)) 2 3)
;; => 5
```

Or you can pass it to another function:

```clj
(defn do-something-with-two-numbers
  [what-to-do a b]
  (what-to-do a b))

(do-something-with-two-numbers (fn [a b] (+ a b) 2 3)
```

Of course all these examples are extremely primitive and simply reuse
and re-implement what's already there, but it should give you a rough
idea of how it all functions.

Try it out in repl.

Excercise: Write a named function that receives an anonymous function
and calls it with two passed arguments.

#### Let and locals

When you want some lexically-scoped named values to use in a section of
your code, you can use the `let` form:

```clj
(let [width     10
      height    20
      thickness 2]
  (println "hello from inside the `let`.")
  (* width
     height
     thickness))
```

#### Control Structures

Control structures help you to take different execution paths. For
example, if you have `if` form, you'd like to evaluate one form if
condition is truty and different one if it's faulty, which changes
the evaluation order.

Let's imagine for a second that `when` (prety much same as if, just
without false statement was a function:

```clj
(when condition
  (truthy-expression-1)
  (truthy-expression-2))
```

Clojure would execute first `condition` and then `truthy-expression-1`
(and 2). But `truthy-expressions` will be evaluated even if `condition`
is false.

That's pretty much where we learn why macros exist and how to apply
them. Majority of control structures are implemented as macros
in Clojure. Macros are taking Clojure code and modifying it, as if it
was a list (which it actually is ;). What `when` does under the hood, is
it expands to `if` without false clause:

```clj
(if condition
  (do
    (truthy-expression-1)
    (truthy-expression-2)))
```

Main control structures, or at least ones that we're going to use
throughout the workshop are `if`, `when`, `if-not`, `when-not` and
`if-let`.

```clj
(def number 5)

(if (odd? number)
  (pirntln "odd")
  (pirntln "even"))

(if-not (odd? number)
  (pirntln "even")
  (pirntln "odd"))

(when (even? number)
  (println "even"))

(when-not (even? number)
  (println "odd"))

(if-let [is-even? (even? number)]
  (println "even? " returned " " is-even? " for " number))
```

#### Collection fns

Whatever you do, majority of tasks are related to Enumerables. They're
your "bread and butter", bare neccessities.

With `map` you can apply a function to every value in a collection. The
result is a new collection. You can often use map instead of manually
looping over a collection. Some examples using map:

```clj
(map inc [10 20 30])     ; ⇒ (11 21 31)
(map str [10 20 30])     ; ⇒ ("10" "20" "30")
;; You can define the function to be used on-the-fly:
(map (fn [x] (str "=" x "=")) [10 20 30])
;; ⇒ ("=10=" "=20=" "=30=")

;; And `map` knows how to apply the function you give it
;; to mulitple collections in a coordinated way:
(map (fn [x y] (str x y)) [:a :b :c] [1 2 3])
;; ⇒ (":a1" ":b2" ":c3")
```

Use `filter` with a predicate function to pare down a collection to just
the values for which `(the-pred the-value)` returns true:

```clj
(filter odd? (range 10))
;; ⇒ (1 3 5 7 9)
```

Use `remove` for the opposite effect (which amounts to removing the items
for which `(pred val)` returns true):

```clj
(remove odd? (range 10))
;; ⇒ (0 2 4 6 8)
```

`reduce` is a gem. You use it to apply a function to the first and
second items in a coll and get a result. Then you apply it to the result
you just got and the 3rd item in the coll. Then the result of that and
the 4th. And so on. The process looks something like this:

```clj
(reduce + [1 2 3 4 5])
;; → 1 + 2   [3 4 5]
;; → 3       [3 4 5]
;; → 3 + 3   [4 5]
;; → 6       [4 5]
;; → 6 + 4   [5]
;; → 10      [5]
;; → 10 + 5
;; ⇒  15
```

You may think of `reduce` as of `for` loop with accumulator,
actually. I would even go as far as saying that it's a functional way of
doing so.

### Exercise: simple function

Write a function that doubles an integer.

### Exercise: factorial (I bet you knew)

Implement a function that receives a number and calculates a factorial of it.

### Excercise:

### Exercise: Implement your own `map`

Now, as we've got the basics, we can go ahead and get our hands dirty
with recursion. Since majority of collection operations are related to
recursion in some way, we have to learn how to use recursion rather than
forcing ourselves to have a mutable state.

`map` receives two arguments:

  * `f`, - function that should be applied to each element of old
    collection to get new colllection
  * `coll` - original collection

Basic algoritm for `map` is as follows:

  * if the incoming collection is empty, return an empty collection
  * if collection is not empty,
    * Apply `f` to first element of the collection [1]
    * Prepend result of [1] to result of execution of `map` with tail of
      collection.

Functions you will require:

  * `first` - get first item in the collection.
  * `empty?` - returns true if collection has no items.
  * `next` - returns a items after the first one in given collection
  * `'()` or `(list)` - creates an empty list

### Exercise: Implement your own `reduce`

Reduce is quite similar to `map`. It receives 3 arguments: aggregation
function, initial value and collection. Aggregation function should be a
function of two arguments, accumulator and current item.

Try to figure it out yourself ;)

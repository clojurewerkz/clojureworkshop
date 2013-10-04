---
title: "Questionnaire report"
layout: article
---

# Clojure. I need.

Hey, Munich Workshop is just around the corner, and we just finished
processing data gathered with our Questionnaire. If you haven't yet gotten a
chance to fill it up, please do so, all reports will be updated as we
get more data. You can find the form
[here](https://docs.google.com/forms/d/1JHMMm5F7JWTNs_QFYyTpP0jI-w1Bo2tTpMSeCJsSIDA/viewform).

We've got a total of 42 people answering the questions, coming from
various backgrounds. The results yield quite some interesting data.

If you're comfortable with histograms/bar plots, join our journey, it's
going to be fun!

# Languages

The question was: "What languages do you have significant (ie > 5-7K LOC)
experience in?"

Of course,`Java/C#` is an obvious leader here, but
there're quite some people coming from `Python`, `Ruby` and `JavaScript`
background, which is not as surprising, since these it seems that lots
of startups have been using these languages, and now people are
searching for something new to power up their systems.

Interestingly, there're just as many `C/C++` developers as ones of the
individual "scripting" languages, which is a good indicator for me. I'm not sure if
they find their environment limiting, or just looking for new stuff, we'll
find out a bit later.

![Background Languages](/assets/images/questionnaire/languages.png)

# Application Domain

Question was: "In what context will you most likely  be using clojure
in the future?"

Majority of people would like to apply Clojure to their `Backend`
systems. Clojure is JVM-based, so is easy to operate (and convince ops
to use it), and has lots of libraries in a toolbelt that make the lives of
Backend developers easier. Also, the Clojure's way to handle concurrency
might also be a factor for people to learn it.

There are quite some people who'd like to use Clojure for `Web`
development. Clojure has several libraries for building Web Application,
and [ClojureWerkz](http://clojurewerkz.org) team is working hard to
improve the lives of Web developers as well, our new Web library is to
be announced soon! Time to get excited!

There were also a few (not too many, though) people who would like to use
Clojure as a prototyping language. I personally think that Clojure is well
suited for this!

![Target Application Domain](/assets/images/questionnaire/target.png)

# Programming Concepts

Rating Scale was:

  1. Never heard of
  2. Heard/read about it
  3. Vaguely remember from some class in college
  4. Played around, wrote some code
  5. Used at home for oss project or similar
  6. Use regularly/in production code
  7. Use on daily basis / can't live without it

## Higher Order Functions

The distribution is somehow flat, however people remembering it from college
prevail.

![Higher Order Functions](/assets/images/questionnaire/higher_order_functions.png)

## Lexical Closures

With `Lexical Closures` distribution is a bit different. Although
there are quite some people who can't live without them in production
environment. Which is explainable, since concepts is extremely powerful!

![Lexical Closures](/assets/images/questionnaire/lexical_closures.png)

## Lazy Evaluation

With `Lazy Evaluation`, the situation is a bit more complicated:
people vaguely remember it from some class in college (thank you, public
education!). We hope to change it for better, since `Lazy Evaluation`
can help you quite a lot, especially in `Backend` development.

![Lazy Evaluation](/assets/images/questionnaire/lazy_evaluation.png)

## Recursion

Here, the majority of people have used `Recursion` either in their pet
project, Open Source code, or in production (which is great). In any
case, even that may be improved, since writing recursive code can help
you to avoid some state. Although complete team should be comfortable
with a concept to use it well.

![Recursion](/assets/images/questionnaire/recursion.png)

## Metaprogramming/Macros

Interestingly, `metaprogramming` is quite underrated. Just a few people
used or use it, majority actually is not quite easy with that concept.
Macros may be a bit too specific, but `metaprogramming` principles are
represented in quite some languages.

![Metaprogramming/Macros](/assets/images/questionnaire/metaprogramming.png)

## DSLs

`DSLs`, or fitting language into the problem domain has a rather flat
distribution, which is a bit contraty to metaprogramming. Since most
powerful DSLs are yielded by using Metaprogramming concepts.

![DSLs](/assets/images/questionnaire/dsls.png)

## Concurrency

Even though there's a high interest in backend development, majority of
answers are sitting somewhere in lower grades of rating. `Concurrency`
can boost your backend and save you some processing power. Hopefully,
after the workshop everyone can say they can't live without it anymore.

![DSLs](/assets/images/questionnaire/concurrency.png)


## Functional Sequence Manipulation

`Functional-Style Sequence Manipulation` (concepts such as `map`,
`reduce`, `filter` on collections) seem to be quite used among the
folks. Luckily, modern programming languages include functional-style
sequence manipulation into their Standard Libraries. Also, that makes
code more readable (and writable).

![Functional Style Sequence Manipulation](/assets/images/questionnaire/functional_sequences.png)

# Reasons to Learn Clojure

Also, we've got quite some amazing answers to the question "What are
your expectations form Clojure?"

### Pragmatic ones:

  * "Learn new ways of thinking"
  * "More fun programming"
  * "Less code"
  * "Cleaner code, less side effects, reusable components"
  * "To be honest? Because I love functional programming."

### Learning excperiences:

  * "Learn new concepts that other languages don't have"
  * "Want to learn a lispy language and have heard good things about
    Clojure based libs" (that's especially exciting to hear)
  * "Broaden my experience to solve large-scale tasks in 'bigdata'
    processing"

### Because it's good:

  * "Because it is just right. So much good stuff there"
  * "It's becomming more and more famous among programmers"
  * "The power it gives you"

### Because it's Lisp!

  * "because it is Lisp"
  * "It's the only decent and reasonable Lisp implementation"
  * "A modern Lisp with a bright future"
  * "Lisp, Functional, Concurrent, Immutable"

###  And "Because it's JVM":

  * "JVM Functional Programming Language"
  * "Lisp power + java simplified. One way to make things right"
  * "Bringing elegance to the JVM"
  * "It's completely different from OOP languages. It runs on the JVM so
    I have access to the whole Java and JVM languages ecosystem."
  * "Needed a Lisp style language with a broad ecosystem, higher
    customer acceptance through JVM use"

And the __absolute__ best one: `I need.`

# The End

It was an interesting Questionnaire, and we've learned a little bit
about people who'd like to attend our workshops.

It's great that people are at least familiar with concepts, maybe we
should shape our comminity a little bit to make all these concepts a
more approachable and foster usage of those to make our codebases
clearer and better.

We'll keep adjusting materials to make underrepresented concepts more
highlighted and show everyone why `Metaprogramming`, `Concurrency`, `Higher
Order Functions`, `DSLs`, `Closures`, `Recursion` and `Lazy Evaluation` are so
important and powerful.

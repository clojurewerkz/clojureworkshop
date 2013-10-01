---
title: "Questionnaire report"
layout: article
---

# Questionnaire Report

Hey, Munich Workshop is just around the corner, and we just finished
processing data for our Questionnaire. If you haven't yet gotten a
chance to fill it up, please do so, all reports will be updated as we
get more data. You can find the form
[here](https://docs.google.com/forms/d/1JHMMm5F7JWTNs_QFYyTpP0jI-w1Bo2tTpMSeCJsSIDA/viewform).

We've got a total of 42 people answering questions, coming from
different background, and answers yield quite some interesting data.

If you're comfortable with histograms/bar plots, join our journey, it's
going to be fun!

# Languages

Question was: "What languages do you have significant (ie > 5-7K LOC)
experience in?"

Of course,`Java/C#` is an obvious leader here, but
there're quite some people coming from `Python`, `Ruby` and `JavaScript`
background, which is not as surprising, since these it seems that lots
of startups have been using these languages, and now people are
searching for something new to power up their systems.

Interestingly, there're just as many `C/C++` developers as ones of the
"scripting" languages, which is a good indicator for me. Not sure if
they find their environment limiting, or just look for new stuff, we'll
see it a bit later here.

![Background Languages](/assets/images/questionnaire/languages.png)

# Application Domain

Question was: "In what context will you most likely  be using clojure
in the future?"

Majority of people would like to apply Clojure to their `Backend`
systems. Clojure is JVM-based, so is easy to operate (and convince ops
about using), and has lots of libraries in a toolbelt that make lives of
Backend developers easier. Also, the way concurrency is handled in
Clojure may be not the last factor for people to pick it as a next
language to learn.

Although, there're quite some people who'd like to use Clojure for `Web`
development. Clojure has several libraries for building Web Application,
and [ClojureWerkz](http://clojurewerkz.org) team is working hard to
improve lives of Web developers as well, our new Web library is soon to
be announced (get excited, yay!).

In my opinion, Clojure is also a good language for prototyping, and
there're some people who picked that option, too. Although, not that many.

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

Here, the distribution is quite flat, somehow. Although people who
vaguely remember `Higher Order Functions` from the class in colledge
somehow prevail.

![Higher Order Functions](/assets/images/questionnaire/higher_order_functions.png)

## Lexical Closures

With `Lexical Closures` distribution is a bit different. Although
there're quite some people who can't live without them in production
environment. Which is explainable, since concepts is extremely powerful!

![Lexical Closures](/assets/images/questionnaire/lexical_closures.png)

## Lazy Evaluation

With `Lazy Evaluation`, it's a bit more complicated. Here, once again,
people vaguely remember it from some class in college (thank you, public
education!). We hope to change it for better, since `Lazy Evaluation`
can help you quite a lot, especially in `Backend` development.

![Lazy Evaluation](/assets/images/questionnaire/lazy_evaluation.png)

## Recursion

Here, majority of peopl have used `Recursion` either in their pet
project, Open Source code, or in production, which is great. In any
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

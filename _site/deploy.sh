#!/bin/sh
 
./bin/jekyll build
 
rsync -r --progress _site sites@clojurewerkz.org:clojurewerkz/clojureworkshop.de/

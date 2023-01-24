let mutable  a = 20
a <- 10

let items = [1..5]
List.append items [6]
items

let prefix prefixStr baseStr =
    prefixStr + "," + baseStr

prefix "Hello" 1
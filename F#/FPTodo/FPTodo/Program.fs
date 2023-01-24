let mutable  a = 20
a <- 10

let items = [1..5]
List.append items [6]
items

let prefix prefixStr baseStr =
    prefixStr + "," + baseStr

let names = ["Gus"; "Carls"; "Alex"]

let prefixWithHello = prefix "Hello"

let exclaim s =
    s + "!"

let bigHello = prefixWithHello >> exclaim

let hellos =
    names
    |> Seq.map (fun x -> printfn "Mapped over %s" x; bigHello x)
    |> Seq.sort
    |> Seq.iter (printfn "%s")
   
hellos
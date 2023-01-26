open System.Reflection
open System.Threading.Tasks

module TodoListApp =
    
    type TaskContent = { Description: string}
    type TodoItem =
    | Task of TaskContent
    type TodoList = TodoItem List

    module TodoList = 
        let Add item tasks = item::tasks
        let Remove itemIndex tasks = tasks |> List.removeAt itemIndex
        
        let Sort tasks = tasks |> List.sort
        let Display tasks = 
            tasks
            |> List.indexed
            |> List.iter (fun (index, task) -> printfn "%i. %A" index task)
    

open TodoListApp
open System

let getInput () = Int32.TryParse (Console.ReadLine())

//let tasks: TodoList = [];
let readTaskDescription() =
    printfn "Enter Task:"
    Console.ReadLine()
let readTaskNumber() =
    printfn "Enter task number:"
    let (_, index) = getInput ()
    index

let displayTask () = TodoList.Display

let exit () = printfn "See you soon"
let printMenu() =
    printfn "Menu: "
    printfn "1. Add Task"
    printfn "2. Remove Task"
    printfn "3. Display Task"
    printfn "4. Exit"
    printf "Enter your choice: "
    
let rec menu (tasks: TodoList) =
    printMenu()
    match getInput() with
    | true, 1 ->
        let description = readTaskDescription()
        let task = Task {Description = description}
        let tasks = tasks |> TodoList.Add task
        printfn("Task added")
        printfn("-----------------")
        menu tasks
    | true, 2 -> 
        let taskNum = readTaskNumber()
        let tasks = tasks |> TodoList.Remove taskNum
        printfn("Task removed")
        printfn("-----------------")
        menu tasks
    | true, 3 -> 
        TodoList.Display tasks
        printfn("-----------------")
        menu tasks
    | true, 4 ->
        exit()
    | _ -> menu(tasks)

menu []

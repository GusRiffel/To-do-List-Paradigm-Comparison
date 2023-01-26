package todolist;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    private int choice;
    //private final InMemoryTodoList todoList;
    private final StackBasedTodoList todoList;

//    public Menu(InMemoryTodoList todoList) {
//        this.todoList = todoList;
//    }

    public Menu(StackBasedTodoList todoList) {
        this.todoList = todoList;
    }

    public void startMenu() {
        while (true) {
            choice = options();
            evaluateChoice(choice);
        }
    }

    private int options() {
        System.out.println("Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. Display Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        return input.nextInt();
    }

    private void evaluateChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter task: ");
                TodoItem todoItem = new TodoItem.TodoItemBuilder()
                        .task(input.next())
                        .build();
                todoList.add(todoItem);
                System.out.println("Task added");
                System.out.println("------------------------");
                break;
            case 2:
                System.out.print("Enter task number: ");
                //todoList.remove(input.nextInt());
                todoList.remove();
                System.out.println("Task removed ");
                System.out.println("------------------------");
                break;
            case 3:
               todoList.displayTasks();
                System.out.println("------------------------");
                break;
            case 4:
                System.out.println("See you soon");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                break;
        }
    }
}

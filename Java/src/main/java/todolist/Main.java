package todolist;

public class Main {

    public static void main(String[] args) {
        //InMemoryTodoList todoList = new InMemoryTodoList();
        StackBasedTodoList todoList = new StackBasedTodoList();
        Menu menu = new Menu(todoList);
        menu.startMenu();
    }
}

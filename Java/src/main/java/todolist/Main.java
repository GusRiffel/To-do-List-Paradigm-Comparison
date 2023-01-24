package todolist;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Menu menu = new Menu(todoList);
        menu.startMenu();
    }
}

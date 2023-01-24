package todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<TodoItem> list = new ArrayList<>();

    public void addTask(TodoItem todoItem) {
        list.add(todoItem);
    }

    public void removeTask(int taskNum) {
        list.remove(taskNum - 1);
    }

    public void displayTasks() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).getTask());
        }
    }
}

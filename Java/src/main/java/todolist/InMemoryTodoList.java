package todolist;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTodoList implements TodoList<TodoItem> {
    private final List<TodoItem> tasks = new ArrayList<>();

    @Override
    public void add(TodoItem task) {
        tasks.add(task);
    }

    @Override
    public void remove(int taskId) {
        tasks.remove(taskId - 1);
    }

    @Override
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i).getDescription());
        }
    }
}

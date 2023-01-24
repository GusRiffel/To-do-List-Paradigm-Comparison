package todolist;

import java.util.Stack;

public final class StackBasedTodoList implements TodoList<TodoItem> {

    private final Stack<TodoItem> tasks = new Stack<>();

    @Override
    public void add(TodoItem task) {
        tasks.push(task);
    }

    @Override
    public void remove(int taskId) {
        tasks.remove(taskId);
    }

    public void remove() {
        tasks.pop();
    }

    @Override
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i).getDescription());
        }
    }
}

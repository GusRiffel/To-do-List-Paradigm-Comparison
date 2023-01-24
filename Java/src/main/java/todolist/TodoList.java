package todolist;

public interface TodoList<T> {

    void add(T task);

    void remove(int taskId);

    void displayTasks();
}

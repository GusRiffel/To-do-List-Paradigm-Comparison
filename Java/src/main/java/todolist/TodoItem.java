package todolist;

public class TodoItem {
    private String task;

    public TodoItem(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public static class TodoItemBuilder {
        private String task;

        public TodoItemBuilder task(String task) {
            this.task = task;
            return this;
        }

        public TodoItem build() {
            return new TodoItem(task);
        }
    }
}



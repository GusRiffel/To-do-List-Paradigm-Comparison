package todolist;

public final class TodoItem {
    private final String description;

    public TodoItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public static class TodoItemBuilder {
        private String description;

        public TodoItemBuilder task(String description) {
            this.description = description;
            return this;
        }

        public TodoItem build() {
            return new TodoItem(description);
        }
    }
}



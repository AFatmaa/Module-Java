package tasks;

/**
 * Represents a basic task with a unique ID, description,
 * and completion status.
 */
public class Task {
    private static int nextId = 1;

    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = nextId;
        nextId++;

        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        if (completed) {
            System.out.println("Task with ID " + id + " is already completed.");
            return;
        }

        completed = true;
    }

    public String getStatus() {
        if (completed) {
            return "Completed";
        }
        return "Not completed";
    }

    public String getTaskType() {
        return "Standard Task";
    }

    public String getSummary() {
        return "ID: " + id
                + ", Description: " + description
                + ", Type: " + getTaskType()
                + ", Status: " + getStatus();
    }
}

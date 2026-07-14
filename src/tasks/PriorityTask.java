package tasks;

/**
 * Represents a task with an additional priority level.
 */
public class PriorityTask extends Task {

    private final String priority;

    public PriorityTask(String description, String priority) {
        super(description);
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String getTaskType() {
        return "Priority Task";
    }

    @Override
    public String getSummary() {
        return super.getSummary() + ", Priority: " + priority;
    }
}

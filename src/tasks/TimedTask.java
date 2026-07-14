package tasks;

/**
 * Represents a task with an additional deadline.
 */
public class TimedTask extends Task {
    private final String deadline;

    public TimedTask(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String getTaskType() {
        return "Timed Task";
    }

    @Override
    public String getSummary() {
        return super.getSummary() + ", Deadline: " + deadline;
    }
}

package tasks;

import java.time.LocalDate;

/**
 * Represents a task with an additional deadline.
 */
public class TimedTask extends Task {
    private final LocalDate deadline;

    public TimedTask(String description, LocalDate deadline) {
        super(description);

        if (deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null.");
        }

        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
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

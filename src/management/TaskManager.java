package management;

import tasks.Task;

/**
 * Stores and manages up to ten tasks.
 */
public class TaskManager {
    private static final int MAX_TASKS = 10;

    private final Task[] tasks;
    private int taskCount;

    public TaskManager() {
        this.tasks = new Task[MAX_TASKS];
        this.taskCount = 0;
    }

    public void addTask(Task task) {
        if (task == null) {
            System.out.println("Task cannot be null.");
            return;
        }

        if (taskCount >= MAX_TASKS) {
            System.out.println("Task manager is full.");
            return;
        }

        tasks[taskCount] = task;
        taskCount++;
    }

    public void completeTask(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].complete();
                return;
            }
        }

        System.out.println("Task with ID " + id + " was not found.");
    }

    /**
     * Returns tasks whose completion status matches the requested status.
     *
     * @param requestedStatus true for completed tasks, false for incomplete tasks
     * @return an array containing tasks with the requested status
     */
    public Task[] getTasksByStatus(boolean requestedStatus) {
        int matchingTaskCount = 0;

        // Count matching tasks so the new array has the exact required size.
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == requestedStatus) {
                matchingTaskCount++;
            }
        }

        Task[] matchingTasks = new Task[matchingTaskCount];
        int matchingTaskIndex = 0;

        // Copy matching task references into the result array.
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == requestedStatus) {
                matchingTasks[matchingTaskIndex] = tasks[i];
                matchingTaskIndex++;
            }
        }

        return matchingTasks;
    }

    public Task[] getAllTasks() {
        Task[] allTasks = new Task[taskCount];

        for (int i = 0; i < taskCount; i++) {
            allTasks[i] = tasks[i];
        }

        return allTasks;
    }
}

package main;

import management.TaskManager;
import tasks.PriorityTask;
import tasks.Task;
import tasks.TimedTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("Clean the room");

        TimedTask task2 = new TimedTask("Complete Java homework", LocalDate.of(2026, 8, 1));

        PriorityTask task3 = new PriorityTask("Fix the application bug", "High");

        TimedTask task4 = new TimedTask("Prepare for the workshop", LocalDate.of(2026, 8, 2));

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.completeTask(task2.getId());
        taskManager.completeTask(task3.getId());

        System.out.println("ALL TASKS");

        Task[] allTasks = taskManager.getAllTasks();

        for (Task task : allTasks) {
            System.out.println(task.getSummary());
        }

        System.out.println();
        System.out.println("COMPLETED TASKS");

        Task[] completedTasks = taskManager.getTasksByStatus(true);

        for (Task task : completedTasks) {
            System.out.println(task.getSummary());
        }

        System.out.println();
        System.out.println("INCOMPLETE TASKS");

        Task[] incompleteTasks = taskManager.getTasksByStatus(false);

        for (Task task : incompleteTasks) {
            System.out.println(task.getSummary());
        }
    }
}

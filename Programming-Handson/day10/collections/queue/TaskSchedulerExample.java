package javatraining.day10.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskSchedulerExample {
    public static void main(String[] args) {
        Queue<Task> taskQueue = new PriorityQueue<>();

        // Enqueue tasks with different priorities
        taskQueue.offer(new Task("Low Priority Task", TaskPriority.LOW));
        taskQueue.offer(new Task("High Priority Task", TaskPriority.HIGH));
        taskQueue.offer(new Task("Medium Priority Task", TaskPriority.MEDIUM));
        taskQueue.offer(new Task("Critical Task", TaskPriority.CRITICAL));


        // Process tasks based on priority
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing: " + task.getName());
        }

    }
}

class Task implements Comparable<Task>,Runnable {
    private String name;
    private TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority.compareTo(other.priority);
    }

    @Override
    public void run() {
        System.out.println("Bussiness");
    }
}

enum TaskPriority {
    CRITICAL, HIGH, MEDIUM, LOW;


}




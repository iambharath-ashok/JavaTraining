package javatraining.day10.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Third");

        System.out.println("Queue: " + queue);

        String frontElement = queue.poll();

        System.out.println("Removed: " + frontElement);

        frontElement = queue.peek();
        System.out.println("New Front: " + frontElement);
        System.out.println("Queue after removal: " + queue);
    }
}

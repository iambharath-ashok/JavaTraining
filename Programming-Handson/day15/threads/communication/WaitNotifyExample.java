package javatraining.day15.threads.communication;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) {
        while (queue.size() >= capacity) {
            try {
                wait(); // Wait if the queue is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(item);
        System.out.println("Produced by : " + Thread.currentThread().getName() + ", Item ::" + item);
        notifyAll(); // Notify consumers that an item is available
    }

    public synchronized int consume() {
        while (queue.isEmpty()) {
            try {
                wait(); // Wait if the queue is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = queue.poll();
        System.out.println("Consumed by : " + Thread.currentThread().getName() + ", Item ::" + item);
        notifyAll(); // Notify producers that space is available
        return item;
    }
}

class ProducerTask implements Runnable {

    private SharedQueue sharedQueue;

    public ProducerTask(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            this.sharedQueue.produce(i);
        }
    }
}

class ConsumerTask implements Runnable {

    private SharedQueue sharedQueue;

    public ConsumerTask(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            this.sharedQueue.consume();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue(5);
        ProducerTask producerTask = new ProducerTask(sharedQueue);
        ConsumerTask consumerTask1 = new ConsumerTask(sharedQueue);
        ConsumerTask consumerTask2 = new ConsumerTask(sharedQueue);


        /*Runnable producerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.produce(i);
            }
        };

        Runnable consumerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
            }
        };*/

       /* Runnable consumerTask2 = () -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
            }
        };*/

        Thread producerThread = new Thread(producerTask, "Producer");
        Thread consumerThread1 = new Thread(consumerTask1, "Consumer1");
        Thread consumerThread2 = new Thread(consumerTask2, "Consumer2");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();

        try {
            producerThread.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

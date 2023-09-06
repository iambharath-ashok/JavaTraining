package javatraining.day15.threads.communication;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedQueueWithConditional {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public SharedQueueWithConditional(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) {
        lock.lock();
        try {
            while (queue.size() >= capacity) {
                notFull.await(); // Wait if the queue is full
            }
            queue.add(item);
            System.out.println("Produced: " + item);
            notEmpty.signal(); // Signal consumers that an item is available
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public int consume() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.await(); // Wait if the queue is empty
            }
            int item = queue.poll();
            System.out.println("Consumed: " + item);
            notFull.signal(); // Signal producers that space is available
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockConditionExample {
    public static void main(String[] args) {
        SharedQueueWithConditional sharedQueue = new SharedQueueWithConditional(5);

        Runnable producerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.produce(i);
            }
        };

        Runnable consumerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
            }
        };

        Thread producerThread = new Thread(producerTask, "Producer");
        Thread consumerThread = new Thread(consumerTask, "Consumer");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

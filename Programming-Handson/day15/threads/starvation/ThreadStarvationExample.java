package javatraining.day15.threads.starvation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadStarvationExample {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    System.out.println("High-priority thread is working.");
                    Thread.sleep(100); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread lowPriorityThread = new Thread(() -> {
            while (true) {
                System.out.println("Low-priority thread is waiting to acquire the lock.");
                lock.lock();
                try {
                    System.out.println("Low-priority thread acquired the lock.");
                } finally {
                    lock.unlock();
                }
            }
        });

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

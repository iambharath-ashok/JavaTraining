package javatraining.day15.threads.try_finally;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWithLock {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                lock1.lock();
                System.out.println(Thread.currentThread().getName()+" Thread acquired the lock_1");
                // Perform some critical section work
                lock2.lock();
                System.out.println(Thread.currentThread().getName()+" Thread acquired the lock_2");
            } finally {
                lock2.unlock();
                System.out.println(Thread.currentThread().getName()+" Thread released the lock _1");
                lock1.unlock();
                System.out.println(Thread.currentThread().getName()+" Thread released the lock _2");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                lock1.lock();
                System.out.println(Thread.currentThread().getName()+" Thread acquired the lock_1");
                // Perform some critical section work
                lock2.lock();
                System.out.println(Thread.currentThread().getName()+" Thread acquired the lock_2");
            } finally {
                lock2.unlock();
                System.out.println(Thread.currentThread().getName()+" Thread released the lock _1");
                lock1.unlock();
                System.out.println(Thread.currentThread().getName()+" Thread released the lock _2");
            }
        });

        thread1.start();
        thread2.start();
    }
}

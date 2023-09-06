package javatraining.day15.threads.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Philosopher extends Thread {
    private Lock leftFork;
    private Lock rightFork;

    public Philosopher(Lock leftFork, Lock rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        while (true) {
            leftFork.lock();
            System.out.println(Thread.currentThread().getName() + " picked up left fork.");
            rightFork.lock();
            System.out.println(Thread.currentThread().getName() + " picked up right fork and is eating.");
            rightFork.unlock();
            leftFork.unlock();
            System.out.println(Thread.currentThread().getName() + " put down both forks and is thinking.");
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Lock[] forks = new Lock[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new ReentrantLock();
        }

        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(forks[i], forks[(i + 1) % numPhilosophers]);
            philosophers[i].start();
        }
    }
}

package javatraining.day15.threads.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }

        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i);
            philosophers[i].start();
        }

        try {
            for (Philosopher philosopher : philosophers) {
                philosopher.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static class Philosopher extends Thread {
        private int index;

        public Philosopher(int index) {
            this.index = index;
        }

        private void think() {
            System.out.println("Philosopher " + index + " is thinking.");
        }


/*        public void method() {
            leftLock.lock();

//            //s
//            sdSD
//                    S
//                    S

            rightLock.lock();

            //            //s
//            sdSD
//                    S
//                    S

            rightLock.unlock();

            leftLock.unlock();

        }*/

        private void eat() {
            int fork1 = index;
            int fork2 = (index + 1) % DiningPhilosophers.NUM_PHILOSOPHERS;

            forks[fork1].lock();
            forks[fork2].lock();

            try {
                System.out.println("Philosopher " + index + " is eating.");
                // Simulate eating
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                forks[fork2].unlock();
                forks[fork1].unlock();

            }
        }

        @Override
        public void run() {
            while (true) {
                think();
                eat();
            }
        }
    }
}

package javatraining.day15.threads.raceconditions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FixedTicketBookingRaceCondition {
    private static int availableSeats = 100;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable bookTicketTask = () -> {
            for (int i = 0; i < 50; i++) {
                lock.lock();
                try {
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println(Thread.currentThread().getName() + " booked a ticket.");
                        System.out.println("Current Available Seats: "+ availableSeats);
                    }
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadA = new Thread(bookTicketTask, "Thread A");
        Thread threadB = new Thread(bookTicketTask, "Thread B");

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Available seats: " + availableSeats);
    }
}

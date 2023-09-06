package javatraining.day15.threads.raceconditions;

public class TicketBookingRaceCondition {
    private static int availableSeats = 100;

    public static void main(String[] args) {
        Runnable bookTicketTask = () -> {
            for (int i = 0; i < 50; i++) {
                if (availableSeats > 0) {
                    availableSeats--;
                    System.out.println(Thread.currentThread().getName() + " booked a ticket.");
                    System.out.println("Current Available Seats for:  "+ Thread.currentThread().getName()+" count::"+availableSeats);
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

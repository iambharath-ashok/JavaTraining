package javatraining.day15.threads.raceconditions;

public class FixedBankAccountRaceCondition {
    private static int balance = 1000;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Runnable withdrawTask = () -> {
            for (int i = 0; i < 100; i++) {
                int amount = (int) (Math.random() * 100);
                withdraw(amount);
            }
        };

        Thread threadA = new Thread(withdrawTask, "Thread A");
        Thread threadB = new Thread(withdrawTask, "Thread B");

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + balance);
    }

    private static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        }
    }
}

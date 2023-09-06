package javatraining.day15.threads.synchronization;

public class NonSynchronizedExample {
    private static int sharedCounter = 0;

    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 100; i++) {
                //sharedCounter++;
                System.out.println(Thread.currentThread().getName() + " incremented: " + ++sharedCounter);
            }
        };

        Thread threadA = new Thread(incrementTask, "Thread A");
        Thread threadB = new Thread(incrementTask, "Thread B");
        Thread threadC = new Thread(incrementTask, "Thread C");

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final shared counter value: " + sharedCounter);
    }
}

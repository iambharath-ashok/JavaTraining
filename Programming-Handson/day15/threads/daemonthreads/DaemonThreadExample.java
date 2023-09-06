package javatraining.day15.threads.daemonthreads;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread backgroundThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running.");
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        backgroundThread.setDaemon(false); // Set the thread as a daemon thread
        backgroundThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is exiting.");
    }
}

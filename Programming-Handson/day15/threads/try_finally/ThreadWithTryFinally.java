package javatraining.day15.threads.try_finally;

public class ThreadWithTryFinally {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                // Acquire resources or perform tasks that might throw exceptions
                System.out.println("Thread started");
                // Simulate some work
                Thread.sleep(2000);
                System.out.println("Thread completed its work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Release resources or perform cleanup tasks
                System.out.println("Thread is cleaning up");
            }
        });

        thread.start();
    }
}

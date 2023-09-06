package javatraining.day15.threads.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {
    private int taskId;

    public MyCallable(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        // Simulate some work
        Thread.sleep(50000);
        return "Task " + taskId + " completed by " + Thread.currentThread().getName();
    }
}

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit Callable tasks
        Future<String> future1 = executor.submit(new MyCallable(1));
        Future<String> future2 = executor.submit(new MyCallable(2));
        Future<String> future3 = executor.submit(new MyCallable(3));

        // Wait for tasks to complete and get results
        String result1 = future1.get();//Blocking Operation
        String result2 = future2.get();
        String result3 = future3.get();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        executor.shutdown();
    }
}

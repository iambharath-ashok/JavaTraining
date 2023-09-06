package javatraining.day15.threads.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSumOfIntegersExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            int result = 0;
            for (int i = 1; i <= 10; i++) {
                result += i;
            }
            return result;
        };

        Future<Integer> future = executor.submit(task);

        // Wait for the task to complete and get the result
        int sum = future.get();

        System.out.println("Sum of numbers from 1 to 10: " + sum);

        executor.shutdown();
    }
}

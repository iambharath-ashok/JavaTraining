package javatraining.day15.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FileProcessor implements Runnable {
    private String filename;

    public FileProcessor(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        System.out.println("Processing file: " + filename + " by thread " + Thread.currentThread().getName());
        // Simulate processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class FileProcessingApp {
    public static void main(String[] args) {
        int numThreads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        String[] filesToProcess = {"file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt"};

        for (String filename : filesToProcess) {
            executor.submit(new FileProcessor(filename));
        }

        executor.shutdown();
    }
}

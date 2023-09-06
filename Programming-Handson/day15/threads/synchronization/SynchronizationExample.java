package javatraining.day15.threads.synchronization;

class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public synchronized int getCount() {
        return count;
    }
}

/*class Task implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName()+ " is incrementing counter value to:: "+ counter.getCount());

        }
    }
}*/

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName()+ " is incrementing counter value to:: "+ counter.getCount());

            }
        };
        
        Thread thread1 = new Thread(task, "Thread - 1");
        Thread thread2 = new Thread(task, "Thread - 2");
        Thread thread3 = new Thread(task, "Thread - 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Count: " + counter.getCount());
    }
}

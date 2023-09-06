package javatraining.day15.threads.reentrant;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task implements Runnable {

    private Lock lock = new ReentrantLock();


    public void  run() {
        m1();
    }

    public String m1() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "Accquired Lock 1");
            Thread.sleep(2000);
            m2();
        } catch (InterruptedException e ) {

        }
        return "Nothing";
    }

    public String m2() {
        try {
            System.out.println(Thread.currentThread().getName() + " is already having Lock 1");

        } finally {
          lock.unlock();
        }
        return "Nothing";
    }
}
public class ReentrantExample {
}

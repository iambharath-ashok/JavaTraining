package javatraining.day15.threads.synchronization;

class BankAccount {
    private int balance;


    public  void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public   void withdraw(int amount) {

            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
    }

    public  int getBalance() {
        return balance;
    }
}

public class BankTransactionsExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable depositTask = () -> {
            account.deposit(100);
        };

        Runnable withdrawTask = () -> {
            account.withdraw(50);
        };

        Thread thread1 = new Thread(depositTask);//new
        Thread thread2 = new Thread(withdrawTask);



        thread1.start();//Runnable or running
        thread2.start();




        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());// terminated
    }
}

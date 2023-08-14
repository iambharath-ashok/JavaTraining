package javatraining.day3.encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;

    private String branch;

    // Constructor
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        String branch = "abc";
        this.branch = "main";
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 5000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(1000);
        account.withdraw(2000);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}

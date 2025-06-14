package oop;

public abstract class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
        System.out.println(holderName + " deposited $" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return holderName + " [" + accountNumber + "] has $" + balance;
    }
}

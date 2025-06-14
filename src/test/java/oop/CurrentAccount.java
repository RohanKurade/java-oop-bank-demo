package oop;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew $" + amount + " with overdraft");
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded for " + holderName);
        }
    }
}

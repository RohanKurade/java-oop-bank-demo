package oop;

public class Main {
    public static void main(String[] args) {
        BankAccount john = new SavingsAccount("ACC001", "John Doe", 2000.0, 0.03);
        BankAccount jane = new CurrentAccount("ACC002", "Jane Smith", 1000.0, 500.0);

        john.deposit(300);
        john.withdraw(500);
        ((SavingsAccount) john).addInterest();

        jane.withdraw(1200);  // within overdraft
        jane.withdraw(1000);  // exceeds overdraft
        jane.deposit(500);

        System.out.println(john.getAccountInfo());
        System.out.println(jane.getAccountInfo());
    }
}

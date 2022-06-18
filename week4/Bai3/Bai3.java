package Bai3;

public class Bai3 {
    public static void main(String[] args) {
        Account acc = new Account(1012, 20000000);
        acc.setAnnualInterestRate(0.045);

        acc.withdraw(1500000);
        acc.deposit(3000000);

        System.out.format("Balance: %f", acc.getBalance());
        System.out.println("\nMonthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Creation Date: " + acc.getDateCreated().toString());

    }
}

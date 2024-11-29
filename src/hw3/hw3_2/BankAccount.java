package hw3.hw3_2;

public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Текущий баланс " + this.balance);
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("На счет " + this.accountNumber);
        System.out.println("Ввесен депозит на сумму " + amount);
        System.out.println("На счету " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance > 0) {
            this.balance = this.balance - amount;
            System.out.println("Осталось " + this.balance);
        } else {
            System.out.println("Баланс отрицательный");
        }

    }
}

package hw3.hw3_2;

public class FirstClass {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234", 4);
        bankAccount.getBalance();
        bankAccount.deposit(5);
        bankAccount.withdraw(6);
    }
}

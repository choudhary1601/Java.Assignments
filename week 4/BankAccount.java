class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0;
    }

    Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getOwnerName() {
        return ownerName;
    }

    double getBalance() {
        return balance;
    }

    public String toString() {
        return accountNumber + " " + ownerName + " Balance: " + balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Account a1 = new Account("101", "Roma");
        Account a2 = new Account("102", "Aman", 500);

        System.out.println(a1.deposit(1000));
        System.out.println(a1.deposit(0));
        System.out.println(a1.deposit(-50));

        System.out.println(a1.withdraw(200));
        System.out.println(a1.withdraw(5000));

        System.out.println(a1);
        System.out.println(a2);
    }
}
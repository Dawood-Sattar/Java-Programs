//1. Create a BankAccount class with private attributes (accountNumber, balance). Implement getter and setter methods, ensuring the balance cannot be set to a negative value.
class BankAccount {
    private double balance; // private variable
    // Constructor to set initial balance

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance of 500
        account.deposit(150); // Deposit 150
        System.out.println("Balance: " + account.getBalance()); // Print balance
    }
}

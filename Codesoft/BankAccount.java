package Codesoft;
// Bank account Management With ATM
import java.util.*;
//class Bank account
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: Rs:" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance: Rs: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Current balance: Rs: " + balance);
    }
}
//clsss ATM
 class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Welcome to the ATM. Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleDeposit();
                    break;
                case 2:
                    handleWithdrawal();
                    break;
                case 3:
                    handleCheckBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void handleDeposit() {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void handleWithdrawal() {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private void handleCheckBalance() {
        account.checkBalance();
    }
}
//class Main
class Main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance is Rs: 500.00
        ATM atm = new ATM(account);
        atm.start();
    }
}
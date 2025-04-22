import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;
    private boolean isActive;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        this.isActive = true;
    }

    public void withdraw(double amount) {
        if (balance <= 0) {
            transactionHistory.add("Withdrawal failed: Insufficient balance");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: -" + amount);
    }

    public void deposit(double amount) {
        double interest = amount * 0.01;
        balance += amount + interest;
        transactionHistory.add("Deposit: +" + amount + " with 1% interest");
    }
}

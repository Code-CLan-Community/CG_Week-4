package advanceJUnitProblems.bankingtransactions;
public class BankingTransactions {
    private double balance;

    // Deposit method adds money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method reduces balance, ensuring there are sufficient funds
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;  // Insufficient funds or invalid withdrawal
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }
}

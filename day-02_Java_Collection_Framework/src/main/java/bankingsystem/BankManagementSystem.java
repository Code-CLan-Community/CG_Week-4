package bankingsystem;
// Creating main class BankManagementSystem
public class BankManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of BankingSystem
        BankingSystem account = new BankingSystem();

        account.createAccount(101, 10000.0);
        account.createAccount(102, 5000.0);

        account.requestWithdrawal(101, 2500.0);

        account.processingWithdrawals();
        account.displayAccounts();
    }
}

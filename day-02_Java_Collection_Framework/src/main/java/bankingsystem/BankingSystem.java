package bankingsystem;

import java.util.*;
// Creating class BankingSystem
public class BankingSystem
{
    private HashMap <Integer, Double> customerAccounts;
    private TreeMap <Double, Integer> sortedAccounts;
    private Queue <String> withdrawalQueue;

    // Constructor of the class
    public BankingSystem()
    {
        customerAccounts = new HashMap<>();
        sortedAccounts = new TreeMap<>(Collections.reverseOrder());
        withdrawalQueue = new LinkedList<>();
    }

    // Method to create account
    public void createAccount(int accountNumber, double initialBalance)
    {
        customerAccounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    // Method to request Withdrawal
    public void requestWithdrawal(int accountNumber, double amount)
    {
        withdrawalQueue.add("Account Number " + accountNumber + " - Withdrawal Request " + amount);
    }

    // Method to process Withdrwal
    public void processingWithdrawals()
    {
        while (!withdrawalQueue.isEmpty())
        {
            String request = withdrawalQueue.poll();
            System.out.println("Processing withdrawal from " + request);
        }
    }
    // Method to display accounts
    public void displayAccounts()
    {
        System.out.println("Accounts Sorted by Balance " + sortedAccounts);
    }
}
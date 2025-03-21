package banktransactionsystem;
// Creating class BankAccountSystem to develop a Bank Account System
public class BankAccountSystem
{
    // Attribute of the class
    private static double balance = 1000;
    // Method to withdraw amount
    public static void withdraw (double amount) throws InsufficientBalanceException
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance = balance - amount ;
        System.out.println( "Withdrawal successful, new balance: " + balance);
    }
    // Main method
    public static void main(String[] args)
    {
        // Handling InsufficientBalanceException
        try
        {
            // Calling withdraw method
            withdraw(1500);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid amount!");
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Insufficient balance!");
        }

        // Handling IllegalArgumentException
        try
        {
            // Calling withdraw method
            withdraw(-1000);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid amount!");
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Insufficient balance!");
        }
    }
}

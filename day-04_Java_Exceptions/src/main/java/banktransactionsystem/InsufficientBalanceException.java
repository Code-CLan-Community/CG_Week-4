package banktransactionsystem;
// Creating class InsufficientBalanceException to create custom exception
public class InsufficientBalanceException extends Exception
{
    // Constructor of the class
    public InsufficientBalanceException (String message)
    {
        super(message);
    }
}

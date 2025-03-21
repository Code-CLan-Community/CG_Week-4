package throwvsthrows;
// Creating class ThrowAndThrows
public class ThrowAndThrows
{
    // Method to calculate simple interest
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException
    {
        if(amount < 0 || rate < 0)
        {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        double result = (amount * rate * years) / 100;
        System.out.println("Simple Interest is " + result);
    }
    // Main method
    public static void main(String[] args)
    {
        // Handling IllegalArgumentException
        try
        {
            calculateInterest(-1000, 2.5, 2);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

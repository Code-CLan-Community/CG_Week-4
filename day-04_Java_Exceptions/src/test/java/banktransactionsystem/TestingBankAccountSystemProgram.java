package banktransactionsystem;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating class TestingBankAccountSystemProgram to test our program
public class TestingBankAccountSystemProgram
{
    // Test cases
    @Test
    void testInsufficientBalanceException()
    {
        assertThrows(InsufficientBalanceException.class, ()-> BankAccountSystem.withdraw(1500));
    }

    @Test
    void testIllegalArgumentException()
    {
        assertThrows(IllegalArgumentException.class, ()-> BankAccountSystem.withdraw(-1500));
    }
}

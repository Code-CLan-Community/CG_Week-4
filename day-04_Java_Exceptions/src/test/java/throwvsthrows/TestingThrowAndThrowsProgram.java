package throwvsthrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating class TestingThrowAndThrowsProgram to test our program
public class TestingThrowAndThrowsProgram
{
    @Test
    void testCalculateInterest()
    {
        ThrowAndThrows.calculateInterest(2000,2.5,2);
    }

    @Test
    void testIllegalArgumentException()
    {
        assertThrows(IllegalArgumentException.class, ()-> ThrowAndThrows.calculateInterest(-2000,2.5,2));
    }
}

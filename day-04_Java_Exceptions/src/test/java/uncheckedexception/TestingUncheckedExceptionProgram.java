package uncheckedexception;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating class TestingUncheckedExceptionProgram to test our program
public class TestingUncheckedExceptionProgram
{
    // Test Cases
    @Test
    void testValidInput()
    {
       assertDoesNotThrow(() -> UncheckedException.division(4,2));
    }

    @Test
    void testArithmeticException()
    {
        UncheckedException.division(4,0);
    }

    @Test
    void testDivisionResult()
    {
        UncheckedException.division(4,2);
    }
}

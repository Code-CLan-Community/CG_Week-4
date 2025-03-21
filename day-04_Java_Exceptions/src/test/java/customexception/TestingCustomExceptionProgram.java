package customexception;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingCustomExceptionProgram to test our program
public class TestingCustomExceptionProgram
{
    // Test Cases
    @Test
    void testValidateAge()
    {
        assertDoesNotThrow(() -> CustomException.validateAge(20));
    }

    @Test
    void testCustomException()
    {
        Exception exception = assertThrows(CustomException.class, () -> CustomException.validateAge(10));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}

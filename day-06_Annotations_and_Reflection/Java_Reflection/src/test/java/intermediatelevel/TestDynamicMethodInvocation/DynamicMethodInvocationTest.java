package intermediatelevel.TestDynamicMethodInvocation;
import intermediatelevel.DynamicMethodInvocation.DynamicMethodInvocation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
// Creating class DynamicMethodInvocationTest to test our DynamicMethodInvocation program
public class DynamicMethodInvocationTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContentAdd = new ByteArrayInputStream("add\n5\n3\n".getBytes());
    private final ByteArrayInputStream inContentSubtract = new ByteArrayInputStream("subtract\n5\n3\n".getBytes());
    private final ByteArrayInputStream inContentMultiply = new ByteArrayInputStream("multiply\n5\n3\n".getBytes());

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testAddMethod() {
        System.setIn(inContentAdd);
        DynamicMethodInvocation.main(new String[]{});
        assertTrue(outContent.toString().contains("Result: 8"));
    }

    @Test
    void testSubtractMethod() {
        System.setIn(inContentSubtract);
        DynamicMethodInvocation.main(new String[]{});
        assertTrue(outContent.toString().contains("Result: 2"));
    }

    @Test
    void testMultiplyMethod() {
        System.setIn(inContentMultiply);
        DynamicMethodInvocation.main(new String[]{});
        assertTrue(outContent.toString().contains("Result: 15"));
    }
}

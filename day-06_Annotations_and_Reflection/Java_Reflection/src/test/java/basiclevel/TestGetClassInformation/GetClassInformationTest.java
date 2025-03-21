package basiclevel.TestGetClassInformation;
import basiclevel.GetClassInformation.GetClassInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

// Creating class GetClassInformationTest to test our GetClassInformation program
public class GetClassInformationTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("java.lang.String\n".getBytes());

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @Test
    void testValidClass() {
        GetClassInformation.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Class: java.lang.String"));
        assertTrue(output.contains("Constructors:"));
        assertTrue(output.contains("Fields:"));
        assertTrue(output.contains("Methods:"));
    }

    @Test
    void testInvalidClass() {
        ByteArrayInputStream inInvalidClass = new ByteArrayInputStream("invalid.ClassName\n".getBytes());
        System.setIn(inInvalidClass);

        GetClassInformation.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Class not found: invalid.ClassName"));
    }
}
package dateofbirthtest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;

public class DateOfBirthTest {
    @Test
    public void testDateOfBirth() {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.find(), "Date of birth should match the regex pattern");
    }
}
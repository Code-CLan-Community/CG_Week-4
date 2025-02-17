package usernametest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.*;

public class ValidateUsernameTest {
    @Test
    public void testValidateUsername() {
        String regex = "^[a-zA-Z][0-9a-zA-Z_]{4,14}\\d$"; // Fixed regex
        Pattern pattern = Pattern.compile(regex);
        String input = "us123er_123";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches(), "Username should match the regex pattern");
    }
}

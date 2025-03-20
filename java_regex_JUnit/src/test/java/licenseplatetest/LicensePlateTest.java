package licenseplatetest;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LicensePlateTest {
    @Test
    public void testLicensePlate() {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        String input = "XY1234";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches(), "License plate should match the regex pattern");
    }
}
package socialsecuritynumbertest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class SocialSecurityNumberTest {

    @Test
    public void testValidSocialSecurityNumbers() {

        String regex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";
        Pattern pattern = Pattern.compile(regex);


        //valids
        assertTrue(pattern.matcher("123-45-6789").matches());
        assertTrue(pattern.matcher("987-65-4321").matches());
        assertTrue(pattern.matcher("111-22-3333").matches());

        // Invalid SSNs
        assertFalse(pattern.matcher("123456789").matches()); // No dashes
        assertFalse(pattern.matcher("000-12-3456").matches()); // Starts with 000
        assertFalse(pattern.matcher("666-12-3456").matches()); // Starts with 666
        assertFalse(pattern.matcher("900-12-3456").matches()); // Starts with 9xx
        assertFalse(pattern.matcher("123-00-4567").matches()); // Middle part is 00
        assertFalse(pattern.matcher("123-45-0000").matches()); // Last part is 0000
    }
}

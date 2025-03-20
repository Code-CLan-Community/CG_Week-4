package validateIPAddresstest;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class ValidateIPAddressTest {

    @Test
    public void testValidIPAddresses() {
        String regex = "\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";
        Pattern pattern = Pattern.compile(regex);
        String text = "212.123.156.189 192.256.127.12 172.16.17.32";

        Matcher matcher = pattern.matcher(text);
        assertTrue(matcher.find());
        assertEquals("212.123.156.189", matcher.group());

        assertTrue(matcher.find());
        assertEquals("172.16.17.32", matcher.group());
    }
}


package emailfromtexttest;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.regex.*;


public class EmailsFromTextTest {
    @Test
    public void testEmailsFromText() {
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        String input = "Contact us at support@example.com and info@company.org";
        Matcher matcher = pattern.matcher(input);
        assertTrue("Email should match the regex pattern", matcher.find());
    }
}

package linkfromwebpagetest;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.regex.*;

public class LinkFromWebPageTest {
    @Test
    public void testLinkFromWebPage() {
        String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
        Pattern pattern = Pattern.compile(regex);
        String input = "Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher = pattern.matcher(input);
        assertTrue("Web link should match the regex pattern", matcher.find());
    }
}

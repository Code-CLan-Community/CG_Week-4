package currencyvaluefromtexttest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class CurrencyValueFromTextTest {

    @Test
    public void testCurrencyValuesExtraction() {
        String regex = "\\$?\\d+(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(regex);
        String input = "The price is $45.99, and the discount is 10.50.";

        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.find());
        assertEquals("$45.99", matcher.group());
        matcher.find();
        assertEquals("10.50", matcher.group());
    }
}

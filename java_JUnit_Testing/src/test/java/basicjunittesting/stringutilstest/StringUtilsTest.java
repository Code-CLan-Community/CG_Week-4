package basicjunittesting.calculatortest.stringutilstest;

import static org.junit.jupiter.api.Assertions.*;
import basicJunitproblems.calculator.stringutility.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}

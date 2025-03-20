package advanceJUnitTesting.dateformattest;

import static org.junit.Assert.*;

import advanceJUnitProblems.dateformatter.DateFormatter;
import org.junit.Before;
import org.junit.Test;

public class DateFormatterTest {

    private DateFormatter dateFormatter;

    @Before
    public void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    public void testValidDateConversion() {
        String inputDate = "2025-02-17";
        String expectedDate = "17-02-2025";
        assertEquals(expectedDate, dateFormatter.formatDate(inputDate)); // Should return the correct formatted date
    }

    @Test
    public void testDateWithInvalidFormat() {
        String inputDate = "17-02-2025"; //
        assertNull(dateFormatter.formatDate(inputDate)); //return null
    }

    @Test
    public void testEmptyDate() {
        String inputDate = "";
        assertNull(dateFormatter.formatDate(inputDate)); // return null
    }

    @Test
    public void testNullDate() {
        String inputDate = null;
        assertNull(dateFormatter.formatDate(inputDate)); // return null
    }

    @Test
    public void testInvalidDateString() {
        String inputDate = "2025-02-30"; // Invalid date
        assertNull(dateFormatter.formatDate(inputDate)); // return null
    }
}

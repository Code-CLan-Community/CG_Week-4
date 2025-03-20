package basicjunittesting.calculatortest.isevenparameterizedtest;

import static org.junit.jupiter.api.Assertions.*;
import basicJunitproblems.calculator.isevenparameterized.EvenUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenUtilsTest {

    private final EvenUtils numberUtils = new EvenUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})  // Providing even numbers
    public void testIsEvenWithEvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})  // Providing odd numbers
    public void testIsEvenWithOddNumbers(int number) {
        assertFalse(numberUtils.isEven(number), number + " should not be even");
    }
}

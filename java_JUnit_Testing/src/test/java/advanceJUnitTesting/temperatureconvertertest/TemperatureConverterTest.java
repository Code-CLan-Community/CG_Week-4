package advanceJUnitTesting.temperatureconvertertest;

import static org.junit.Assert.*;
import advanceJUnitProblems.temperatureconverter.TemperatureConverter;
import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @Before
    public void setUp() {
        // Initialize the TemperatureConverter before each test
        converter = new TemperatureConverter();
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double celsius = 0;
        double expectedFahrenheit = 32;
        assertEquals(expectedFahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }

    @Test
    public void testNegativeCelsiusToFahrenheit() {
        double celsius = -40;
        double expectedFahrenheit = -40;
        assertEquals(expectedFahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }

    @Test
    public void testPositiveCelsiusToFahrenheit() {
        double celsius = 100;
        double expectedFahrenheit = 212;
        assertEquals(expectedFahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        double fahrenheit = 32;
        double expectedCelsius = 0;
        assertEquals(expectedCelsius, converter.fahrenheitToCelsius(fahrenheit), 0.01);
    }

    @Test
    public void testNegativeFahrenheitToCelsius() {
        double fahrenheit = -40;
        double expectedCelsius = -40;
        assertEquals(expectedCelsius, converter.fahrenheitToCelsius(fahrenheit), 0.01);
    }

    @Test
    public void testPositiveFahrenheitToCelsius() {
        double fahrenheit = 212;
        double expectedCelsius = 100;
        assertEquals(expectedCelsius, converter.fahrenheitToCelsius(fahrenheit), 0.01);
    }
}

package advanceJUnitProblems.temperatureconverter;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

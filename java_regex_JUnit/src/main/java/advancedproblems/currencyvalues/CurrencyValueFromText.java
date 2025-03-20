package advancedproblems.currencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValueFromText {

    public static void main(String[] args) {
        //Extract Currency Values from a Text
        String regex = "\\$?\\d+(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "The price is $45.99, and the discount is 10.50.";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}

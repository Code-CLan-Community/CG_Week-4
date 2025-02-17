

package extractionregexproblems.capitalizedwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {
        // Define regex
        String regex = "[A-Z]+[a-z]*";  // Matchs capital words
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in NEW YORK";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
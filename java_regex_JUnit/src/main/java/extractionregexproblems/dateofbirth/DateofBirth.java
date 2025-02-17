package extractionregexproblems.dateofbirth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class DateofBirth {
        public static void main(String[] args) {
            // Define regex
            String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";  // Matchs valid DOB
            Pattern pattern = Pattern.compile(regex);
            // Input string to check
            String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

            // Create matcher object
            Matcher matcher = pattern.matcher(input);
            // Find matches
            while (matcher.find()) {
                System.out.println("Matched: " + matcher.group());
            }
        }
    }



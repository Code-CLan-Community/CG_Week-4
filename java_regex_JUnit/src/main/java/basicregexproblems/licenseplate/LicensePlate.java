package basicregexproblems.hexcode.licenseplate;
import java.util.regex.*;

public class LicensePlate {
        public static void main(String[] args) {
            // Define regex
            String regex = "^[A-Z]{2}[0-9]{4}";  // Matchs valid Username
            Pattern pattern = Pattern.compile(regex);
            // Input string to check
            String input = "XY1234";

            // Create matcher object
            Matcher matcher = pattern.matcher(input);
            // Find matches
            while (matcher.find()) {
                System.out.println("Matched: " + matcher.group());
            }
        }
    }


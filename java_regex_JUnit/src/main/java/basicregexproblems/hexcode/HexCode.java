package basicregexproblems.hexcode;
import java.util.regex.*;

public class HexCode {
    public static void main(String[] args) {
        // Define regex
        String regex = "^#[A-Fa-f]{2,3}[0-9]{3,4}";  // Matchs valid Username
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "#ff4500";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}


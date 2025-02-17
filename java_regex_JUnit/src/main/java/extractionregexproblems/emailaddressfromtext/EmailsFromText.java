package extractionregexproblems.emailaddressfromtext;
import java.util.regex.*;

public class EmailsFromText {
    public static void main(String[] args) {
        // Define regex
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";  // Matchs valid email
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "Contact us at support@example.com and info@company.org";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}


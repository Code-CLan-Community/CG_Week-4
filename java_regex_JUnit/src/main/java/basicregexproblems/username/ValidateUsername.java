package basicregexproblems.hexcode.username;


import java.util.regex.*;
public class ValidateUsername {
    public static void main(String[] args) {
        // Define regex
        String regex = "^[a-zA-z]+[0-9a-zA-z]*_*\\d+${5,15}";  // Matchs valid Username
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "us123er_123";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}


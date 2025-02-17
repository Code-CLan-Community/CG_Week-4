package advancedproblems.repeatingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static void main(String[] args) {
        // Define regex
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "This is is a repeated repeated word test.";

        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        while (matcher.find()) {
            System.out.print(matcher.group(1)+",");
        }
    }
}

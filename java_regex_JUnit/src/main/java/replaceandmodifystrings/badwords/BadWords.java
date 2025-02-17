package replaceandmodifystrings.badwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWords {


    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String regex = "\\b(damn|stupid)\\b";
        String replacement = "****";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        // Using find()
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        // Using replaceAll()
        String replacedText = text.replaceAll(regex, replacement);
        System.out.println("Replaced Text: " + replacedText);
    }
}
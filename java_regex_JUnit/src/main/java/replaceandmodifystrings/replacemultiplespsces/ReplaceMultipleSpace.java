package replaceandmodifystrings.replacemultiplespsces;
import java.util.regex.*;
public class ReplaceMultipleSpace{
    public static void main(String[] args) {
        String text = "This   is   an  example   with   multiple   spaces.";
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        // Using find()
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        // Using replaceAll()
        String replacedText = text.replaceAll(regex, " ");
        System.out.println("Replaced Text: " + replacedText);
    }
}

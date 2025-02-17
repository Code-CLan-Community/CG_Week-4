package advancedproblems.programminglanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {
    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regex for Programming Languages
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Using find()
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

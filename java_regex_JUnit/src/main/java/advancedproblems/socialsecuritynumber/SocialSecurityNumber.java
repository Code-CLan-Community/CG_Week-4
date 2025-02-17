package advancedproblems.socialsecuritynumber;
import java.util.regex.*;

public class SocialSecurityNumber {
    public static void main(String[] args) {
        String[] inputs = {
                "123-45-6789",
                "123456789",
                "987-65-4321",
                "000-12-3456",
                "111-22-3333"
        };

        String regex = "\\d{3}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                System.out.println("\"" + input + "\" is valid");
            } else {
                System.out.println("\"" + input + "\" is invalid");
            }
        }
    }
}


package advancedproblems.ipaddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {


    public static void main(String[] args) {
        String text = "212.123.156.189    192.256.127.12`   172.16.17.32   172.16.17.32    172.16.17.32";
        String regex = "\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        // Using find()
        while (matcher.find()) {
            System.out.println("Found: "+ matcher.group());
        }
    }
}
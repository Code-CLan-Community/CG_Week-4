package advanceJUnitProblems.passwordvalidator;

public class PasswordValidator {

    // Method to validate password strength
    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") && // At least one uppercase letter
                password.matches(".*\\d.*");     // At least one digit
    }
}

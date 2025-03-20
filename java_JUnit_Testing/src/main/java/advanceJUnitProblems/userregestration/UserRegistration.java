package advanceJUnitProblems.userregestration;

import java.util.regex.Pattern;

public class UserRegistration {

    // Email validation
    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public String registerUser(String username, String email, String password) {
        // Validate username
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }

        // Validate email
        if (email == null || !Pattern.matches(regex, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        // Validate password
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        // If validation passes, return success
        return "User registered successfully.";
    }
}

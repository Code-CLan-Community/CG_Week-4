package advanceJUnitTesting.userregestrationtest;

import static org.junit.Assert.*;
import advanceJUnitProblems.userregestration.UserRegistration;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @Before
    public void setUp() {
        // Initialize UserRegistration before each test
        userRegistration = new UserRegistration();
    }

    @Test
    public void testValidUserRegistrationNeeraj() {
        String result = userRegistration.registerUser("Neeraj", "neerajKumar23@gmail.com", "Password123");
        assertEquals("User registered successfully.", result);
    }

    @Test
    public void testValidUserRegistrationArpit() {
        String result = userRegistration.registerUser("Arpit", "arpitSharma87@gmail.com", "SecurePass1");
        assertEquals("User registered successfully.", result);
    }

    @Test
    public void testValidUserRegistrationAbhay() {
        String result = userRegistration.registerUser("Abhay", "abhayVerma56@gmail.com", "MyPassword9");
        assertEquals("User registered successfully.", result);
    }

    @Test
    public void testValidUserRegistrationRajan() {
        String result = userRegistration.registerUser("Rajan", "rajanChouhan75@gmail.com", "StrongPass8");
        assertEquals("User registered successfully.", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyUsername() {
        userRegistration.registerUser("", "userTest45@gmail.com", "ValidPass123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullUsername() {
        userRegistration.registerUser(null, "userTest45@gmail.com", "ValidPass123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEmail() {
        userRegistration.registerUser("Neeraj", "invalid-email", "ValidPass123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyEmail() {
        userRegistration.registerUser("Arpit", "", "ValidPass123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullEmail() {
        userRegistration.registerUser("Abhay", null, "ValidPass123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShortPassword() {
        userRegistration.registerUser("Rajan", "rajanChouhan75@gmail.com", "short");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyPassword() {
        userRegistration.registerUser("Neeraj", "neerajKumar23@gmail.com", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPassword() {
        userRegistration.registerUser("Arpit", "arpitSharma87@gmail.com", null);
    }
}

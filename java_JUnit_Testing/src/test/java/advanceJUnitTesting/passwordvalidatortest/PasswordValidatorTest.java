package advanceJUnitTesting.passwordvalidatortest;


import static org.junit.Assert.*;

import advanceJUnitProblems.passwordvalidator.PasswordValidator;
import org.junit.Before;
import org.junit.Test;

public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @Before
    public void setUp() {
        // Initialize PasswordValidator before each test
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void testValidPassword() {
        String validPassword = "Valid123";
        assertTrue(passwordValidator.validate(validPassword)); //return true
    }

    @Test
    public void testPasswordTooShort() {
        String shortPassword = "Short1";  // Less than 8 characters
        assertFalse(passwordValidator.validate(shortPassword)); // return false
    }

    @Test
    public void testPasswordWithoutUppercase() {
        String passwordWithoutUppercase = "nouppercase1";  // No uppercase letter
        assertFalse(passwordValidator.validate(passwordWithoutUppercase)); //return false
    }

    @Test
    public void testPasswordWithoutDigit() {
        String passwordWithoutDigit = "NoDigitHere";  // No digit
        assertFalse(passwordValidator.validate(passwordWithoutDigit)); // return false
    }

    @Test
    public void testPasswordWithoutUppercaseAndDigit() {
        String invalidPassword = "lowercase";  // No uppercase letter and no digit
        assertFalse(passwordValidator.validate(invalidPassword)); // return false
    }

    @Test
    public void testNullPassword() {
        String nullPassword = null;
        assertFalse(passwordValidator.validate(nullPassword)); // return false
    }
}

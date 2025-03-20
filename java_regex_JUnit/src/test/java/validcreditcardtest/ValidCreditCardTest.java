package validcreditcardtest;
import advancedproblems.creditcard.ValidCreditCard;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidCreditCardTest {

    @Test
    public void testValidVisa() {
        assertTrue(ValidCreditCard.ValidVisa("4123456789012345"));
        assertFalse(ValidCreditCard.ValidVisa("5123456789012345"));
    }

    @Test
    public void testValidMasterCard() {
        assertTrue(ValidCreditCard.ValidMasterCard("5123456789012345"));
        assertFalse(ValidCreditCard.ValidMasterCard("4123456789012345"));
    }
}


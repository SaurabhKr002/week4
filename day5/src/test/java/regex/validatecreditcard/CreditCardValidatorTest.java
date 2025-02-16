package regex.validatecreditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    void testValidVisaCards() {
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4123456789012345"));
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4222222222222222"));
    }

    @Test
    void testValidMasterCards() {
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5123456789012345"));
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5423232323232323"));
    }

    @Test
    void testInvalidCardNumbers() {
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("6123456789012345")); // Invalid start
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("412345678901234"));  // Too short
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("51234567890123456")); // Too long
    }
}

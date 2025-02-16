package regex.ssnvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SSNValidatorTest {

    @Test
    void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("My SSN is 123-45-6789."));
        assertTrue(SSNValidator.isValidSSN("SSN: 987-65-4321."));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(SSNValidator.isValidSSN("My SSN is 123456789."));
        assertFalse(SSNValidator.isValidSSN("SSN: 12-345-6789."));
        assertFalse(SSNValidator.isValidSSN("SSN: ABC-DE-FGHI."));
    }
}

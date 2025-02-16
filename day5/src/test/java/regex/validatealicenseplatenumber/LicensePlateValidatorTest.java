package regex.validatealicenseplatenumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LicensePlateValidatorTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY9876"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345")); // Only one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("abc123")); // Lowercase letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABC123")); // Three letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB123"));  // Only three digits
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12345")); // Five digits
    }
}

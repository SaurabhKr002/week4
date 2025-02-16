package regex.validateahexcolorcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HexColorValidatorTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#ABCDEF"));
        assertTrue(HexColorValidator.isValidHexColor("#abcdef"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123")); // Too short
        assertFalse(HexColorValidator.isValidHexColor("FFA500")); // Missing #
        assertFalse(HexColorValidator.isValidHexColor("#1234567")); // Too long
        assertFalse(HexColorValidator.isValidHexColor("#ZZZZZZ")); // Invalid hex characters
    }
}

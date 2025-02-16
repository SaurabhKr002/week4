package regex.validateausername;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("Valid_001"));
        assertTrue(UsernameValidator.isValidUsername("UserName_15"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user")); // Starts with a number
        assertFalse(UsernameValidator.isValidUsername("us"));      // Too short
        assertFalse(UsernameValidator.isValidUsername("user#name")); // Contains invalid character #
        assertFalse(UsernameValidator.isValidUsername("username_too_long_exceed")); // Too long
    }
}

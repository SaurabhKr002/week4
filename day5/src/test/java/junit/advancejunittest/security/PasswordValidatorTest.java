package junit.advancejunittest.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"));
        assertTrue(PasswordValidator.isValidPassword("HelloWorld9"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Abc1"));
    }

    @Test
    void testMissingUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"));
    }

    @Test
    void testMissingDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoNumbersHere"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(""));
    }
}

package junit.advancejunittest.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully",
                UserRegistration.registerUser("Saurabh", "saurabh@example.com", "Password123"));

        assertEquals("User registered successfully",
                UserRegistration.registerUser("Anand", "anand.kumar@mail.com", "SecurePass8"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "valid@mail.com", "Password123"));

        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser(null, "valid@mail.com", "Password123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Saurabh", "invalid-email", "Password123"));

        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Saurabh", "saurabh.com", "Password123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Saurabh", "valid@mail.com", "short"));

        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Saurabh", "valid@mail.com", ""));
    }
}

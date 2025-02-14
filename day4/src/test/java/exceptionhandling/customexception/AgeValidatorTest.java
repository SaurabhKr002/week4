package exceptionhandling.customexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void testValidAge() {
        try {
            assertEquals("Access granted!", AgeValidator.validateAge(20));
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for age 20");
        }
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> AgeValidator.validateAge(16));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}

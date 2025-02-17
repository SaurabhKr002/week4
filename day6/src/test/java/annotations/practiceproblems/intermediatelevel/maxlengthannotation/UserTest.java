package annotations.practiceproblems.intermediatelevel.maxlengthannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testValidUsername() {
        User user = new User("Saurabh"); // Valid username (length ≤ 10)
        assertEquals("Saurabh", user.getUsername());
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("VeryLongUsername"); // Exceeds max length of 10
        });

        assertTrue(exception.getMessage().contains("exceeds max length"));
    }
}

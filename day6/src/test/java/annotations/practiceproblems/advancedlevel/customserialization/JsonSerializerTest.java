package annotations.practiceproblems.advancedlevel.customserialization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializerTest {

    @Test
    void testJsonSerialization() throws IllegalAccessException {
        User user = new User("Saurabh", 25, "securePass");
        String jsonString = JsonSerializer.toJson(user);

        assertEquals("{user_name: Saurabh, user_age: 25}", jsonString);
    }
}

package reflection.basiclevel.privatefield;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReflectionUtilTest {

    @Test
    void testModifyAndRetrievePrivateField() {
        Person person = new Person(25); // Initial age

        // Modify private field using reflection
        ReflectionUtil.setPrivateAge(person, 30);

        // Verify the change
        assertEquals(30, ReflectionUtil.getPrivateAge(person));
        assertEquals(30, person.getAge()); // Ensure value is changed
    }
}

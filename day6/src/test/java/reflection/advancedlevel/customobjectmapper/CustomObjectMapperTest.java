package reflection.advancedlevel.customobjectmapper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapperTest {

    @Test
    public void testToObject() {
        // Create a map of properties to set on the Person object
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Saurabh Kumar");
        properties.put("age", 25);

        // Use the toObject method to map the properties to a Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Assert that the fields have been correctly set
        assertEquals("Saurabh Kumar", person.getName(), "Name should be 'Saurabh Kumar'");
        assertEquals(25, person.getAge(), "Age should be 25");
    }
}

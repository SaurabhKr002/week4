package reflection.advancedlevel.jsonrepresentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonRepresentationTest {

    @Test
    public void testToJson() {
        // Create a Person object
        Person person = new Person("Saurabh Kumar", 25);

        // Convert the person object to a JSON-like string
        String json = JsonRepresentation.toJson(person);

        // Expected JSON-like string
        String expectedJson = "{\"name\": \"Saurabh Kumar\", \"age\": \"25\"}";

        // Assert that the conversion is correct
        assertEquals(expectedJson, json, "The JSON representation should match the expected string.");
    }
}

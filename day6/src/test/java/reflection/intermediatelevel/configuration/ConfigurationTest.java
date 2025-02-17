package reflection.intermediatelevel.configuration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

public class ConfigurationTest {

    @Test
    public void testModifyAPIKeyUsingReflection() {
        try {
            // Access the Configuration class
            Class<?> configClass = Class.forName("reflection.intermediatelevel.configuration.Configuration");

            // Access the private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true); // Allow access to the private field

            // Original API_KEY value before modification
            String originalAPIKey = Configuration.getAPIKey();

            // Modify the value of API_KEY using Reflection
            apiKeyField.set(null, "newAPIKey"); // 'null' because it's a static field

            // Verify that the API_KEY has been modified
            assertEquals("newAPIKey", Configuration.getAPIKey(), "API_KEY should be updated to 'newAPIKey'");

            // Optionally, reset the value to the original one for cleanup
            apiKeyField.set(null, originalAPIKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

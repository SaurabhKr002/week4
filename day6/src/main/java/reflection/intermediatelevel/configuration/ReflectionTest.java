package reflection.intermediatelevel.configuration;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            // Access the Configuration class
            Class<?> configClass = Class.forName("reflection.intermediatelevel.configuration.Configuration");

            // Access the private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true); // Allow access to the private field

            // Print the original value of API_KEY
            System.out.println("Original API_KEY: " + Configuration.getAPIKey());

            // Modify the value of API_KEY using Reflection
            apiKeyField.set(null, "newAPIKey"); // 'null' because it's a static field

            // Print the modified value of API_KEY
            System.out.println("Modified API_KEY: " + Configuration.getAPIKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

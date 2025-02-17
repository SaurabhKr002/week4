package reflection.basiclevel.privatefield;

import java.lang.reflect.Field;

public class ReflectionUtil {

    // Method to modify private field "age"
    public static void setPrivateAge(Person person, int newAge) {
        try {
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow modification
            ageField.set(person, newAge);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to modify private field", e);
        }
    }

    // Method to retrieve private field "age"
    public static int getPrivateAge(Person person) {
        try {
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow access
            return ageField.getInt(person);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to access private field", e);
        }
    }
}

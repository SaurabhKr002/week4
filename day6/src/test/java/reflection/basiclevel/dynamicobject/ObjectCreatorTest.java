package reflection.basiclevel.dynamicobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class ObjectCreatorTest {

    @Test
    void testDynamicObjectCreation() {
        try {
            // Load the Student class dynamically
            Class<?> studentClass = Class.forName("reflection.basiclevel.dynamicobject.Student");

            // Create an instance dynamically using Reflection
            Object studentInstance = studentClass.getDeclaredConstructor().newInstance();

            // Invoke the displayInfo() method using Reflection
            Method displayMethod = studentClass.getMethod("displayInfo");
            assertNotNull(displayMethod);

            // Validate that the object is an instance of Student
            assertTrue(studentInstance instanceof Student);

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testParameterizedConstructor() {
        try {
            // Load Student class
            Class<?> studentClass = Class.forName("reflection.basiclevel.dynamicobject.Student");

            // Get the parameterized constructor
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
            Object studentInstance = constructor.newInstance("Saurabh", 22);

            // Invoke displayInfo() method
            Method displayMethod = studentClass.getMethod("displayInfo");
            assertNotNull(displayMethod);

            // Ensure object is correctly instantiated
            assertTrue(studentInstance instanceof Student);

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}

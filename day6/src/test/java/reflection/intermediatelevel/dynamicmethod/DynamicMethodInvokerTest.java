package reflection.intermediatelevel.dynamicmethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

class DynamicMethodInvokerTest {

    @Test
    void testAddMethod() {
        try {
            Class<?> mathClass = Class.forName("reflection.intermediatelevel.dynamicmethod.MathOperations");
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            Method addMethod = mathClass.getMethod("add", int.class, int.class);
            Object result = addMethod.invoke(mathInstance, 10, 5);

            assertEquals(15, result);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testInvalidMethod() {
        try {
            Class<?> mathClass = Class.forName("reflection.intermediatelevel.dynamicmethod.MathOperations");
            mathClass.getMethod("divide", int.class, int.class); // Method does not exist
            fail("Expected NoSuchMethodException but did not occur.");
        } catch (NoSuchMethodException e) {
            assertTrue(true); // Expected outcome
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}

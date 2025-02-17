package reflection.basiclevel.privatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReflectionInvokerTest {

    @Test
    void testInvokePrivateMethod() {
        Calculator calculator = new Calculator();

        // Invoke private method using reflection
        int result = ReflectionInvoker.invokeMultiply(calculator, 6, 7);

        // Verify the output
        assertEquals(42, result);
    }
}

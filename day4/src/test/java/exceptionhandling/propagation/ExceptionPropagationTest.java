package exceptionhandling.propagation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionPropagationTest {

    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, ExceptionPropagation::method2);
        assertEquals("/ by zero", exception.getMessage());
    }
}

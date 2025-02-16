package junit.basicjunittest.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlerTest {

    @Test
    void testDivideByZero() {
        ExceptionHandler handler = new ExceptionHandler();
        Exception exception = assertThrows(ArithmeticException.class, () -> handler.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message mismatch");
    }

    @Test
    void testValidDivision() {
        ExceptionHandler handler = new ExceptionHandler();
        assertEquals(5, handler.divide(10, 2), "Division result is incorrect");
    }
}

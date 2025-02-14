package exceptionhandling.uncheckedexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionCalculatorTest {

    @Test
    void testValidDivision() {
        assertEquals(5.0, DivisionCalculator.divideNumbers(10, 2), 0.001, "10 / 2 should be 5.0");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> DivisionCalculator.divideNumbers(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

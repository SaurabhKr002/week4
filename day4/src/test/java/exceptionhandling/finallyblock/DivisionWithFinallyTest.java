package exceptionhandling.finallyblock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisionWithFinallyTest {

    @Test
    void testValidDivision() {
        assertEquals(5, DivisionWithFinally.divide(10, 2), "10 / 2 should be 5");
    }

    @Test
    void testDivisionByZero() {
        assertEquals(-1, DivisionWithFinally.divide(10, 0), "Dividing by zero should return -1");
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, DivisionWithFinally.divide(-10, 2), "-10 / 2 should be -5");
    }
}

package junit.basicjunittest.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Testing addition
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5), "Addition failed");
    }

    // Testing subtraction
    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5), "Subtraction failed");
    }

    // Testing multiplication
    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(10, 5), "Multiplication failed");
    }

    // Testing division
    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5), "Division failed");
    }

    // Testing division by zero
    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message mismatch");
    }
}

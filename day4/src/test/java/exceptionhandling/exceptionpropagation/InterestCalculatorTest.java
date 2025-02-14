package exceptionhandling.exceptionpropagation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InterestCalculatorTest {

    @Test
    void testValidInterestCalculation() {
        // Valid case: should return correct interest
        double interest = InterestCalculator.calculateInterest(1000, 5, 2);
        assertEquals(100.0, interest, 0.01, "Interest should be correctly calculated.");
    }

    @Test
    void testNegativeAmountThrowsException() {
        // Expecting IllegalArgumentException for negative amount
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                InterestCalculator.calculateInterest(-500, 5, 2)
        );
        assertEquals("Amount and rate must be non-negative.", exception.getMessage());
    }

    @Test
    void testNegativeRateThrowsException() {
        // Expecting IllegalArgumentException for negative rate
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                InterestCalculator.calculateInterest(1000, -3, 2)
        );
        assertEquals("Amount and rate must be non-negative.", exception.getMessage());
    }

    @Test
    void testZeroValues() {
        // Edge case: Amount or rate as zero should not throw exception
        assertEquals(0.0, InterestCalculator.calculateInterest(0, 5, 2), "Interest should be 0 when amount is 0.");
        assertEquals(0.0, InterestCalculator.calculateInterest(1000, 0, 2), "Interest should be 0 when rate is 0.");
    }
}

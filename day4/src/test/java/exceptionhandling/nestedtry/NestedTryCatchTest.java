package exceptionhandling.nestedtry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NestedTryCatchTest {

    @Test
    void testValidDivision() {
        int[] arr = {10, 20, 30, 40, 50};
        assertDoesNotThrow(() -> NestedTryCatch.divideElement(arr, 2, 5));
    }

    @Test
    void testInvalidIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int value = arr[10]; // Accessing invalid index
        });
        assertNotNull(exception);
    }

    @Test
    void testDivisionByZero() {
        int[] arr = {10, 20, 30, 40, 50};
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            int result = arr[1] / 0; // Division by zero
        });
        assertNotNull(exception);
    }
}

package junit.basicjunittest.parameterized;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    private final NumberUtils utils = new NumberUtils();

    // Even numbers
    void testIsEvenTrue(int number) {
        assertTrue(utils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // Odd numbers
    void testIsEvenFalse(int number) {
        assertFalse(utils.isEven(number), number + " should be odd");
    }
}

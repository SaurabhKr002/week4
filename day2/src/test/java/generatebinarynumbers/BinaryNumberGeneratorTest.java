package generatebinarynumbers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import queueinterface.generatebinarynumbers.BinaryNumberGenerator;

public class BinaryNumberGeneratorTest {

    @Test
    public void testGenerateBinaryNumbers() {
        // Test for N = 5
        int n = 5;
        String[] expected = {"1", "10", "11", "100", "101"};
        String[] actual = BinaryNumberGenerator.generateBinaryNumbers(n);
        assertArrayEquals(expected, actual); // Verify expected output

        // Test for N = 3
        int n2 = 3;
        String[] expected2 = {"1", "10", "11"};
        String[] actual2 = BinaryNumberGenerator.generateBinaryNumbers(n2);
        assertArrayEquals(expected2, actual2);

        // Test for N = 1
        int n3 = 1;
        String[] expected3 = {"1"};
        String[] actual3 = BinaryNumberGenerator.generateBinaryNumbers(n3);
        assertArrayEquals(expected3, actual3);
    }
}

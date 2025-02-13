package listinterface.rotatelist;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RotateListTest {

    @Test
    void testRotate_NormalCase() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        RotateList.rotate(numbers, 2);
        assertEquals(Arrays.asList(30, 40, 50, 10, 20), numbers);
    }

    @Test
    void testRotate_RotateByZero() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        RotateList.rotate(numbers, 0);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), numbers);
    }

    @Test
    void testRotate_RotateBySize() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        RotateList.rotate(numbers, 5);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), numbers);
    }

    @Test
    void testRotate_RotateByMoreThanSize() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        RotateList.rotate(numbers, 7);
        assertEquals(Arrays.asList(3, 4, 5, 1, 2), numbers);
    }

    @Test
    void testRotate_EmptyList() {
        List<Integer> numbers = Arrays.asList();
        RotateList.rotate(numbers, 3);
        assertTrue(numbers.isEmpty());
    }
}

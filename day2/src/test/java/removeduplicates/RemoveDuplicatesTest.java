package removeduplicates;

import listinterface.removeduplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_NormalCase() {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(Arrays.asList(3, 1, 2, 4), result);
    }

    @Test
    void testRemoveDuplicates_AllUnique() {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(Arrays.asList(5, 10, 15, 20), result);
    }

    @Test
    void testRemoveDuplicates_AllSame() {
        List<Integer> numbers = Arrays.asList(7, 7, 7, 7);
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(Arrays.asList(7), result);
    }

    @Test
    void testRemoveDuplicates_EmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> result = RemoveDuplicates.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    void testRemoveDuplicates_StringList() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        List<String> result = RemoveDuplicates.removeDuplicates(words);
        assertEquals(Arrays.asList("apple", "banana", "orange"), result);
    }
}

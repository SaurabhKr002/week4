package settosortedlist;

import setinterface.settosortedlist.SetToSortedListConverter;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SetToSortedListConverterTest {

    @Test
    void testConvertSetToSortedList_NormalCase() {
        Set<Integer> inputSet = Set.of(5, 3, 9, 1);
        List<Integer> expected = List.of(1, 3, 5, 9);

        assertEquals(expected, SetToSortedListConverter.convertSetToSortedList(inputSet));
    }

    @Test
    void testConvertSetToSortedList_AlreadySorted() {
        Set<Integer> inputSet = Set.of(1, 2, 3, 4, 5);
        List<Integer> expected = List.of(1, 2, 3, 4, 5);

        assertEquals(expected, SetToSortedListConverter.convertSetToSortedList(inputSet));
    }

    @Test
    void testConvertSetToSortedList_SingleElement() {
        Set<Integer> inputSet = Set.of(42);
        List<Integer> expected = List.of(42);

        assertEquals(expected, SetToSortedListConverter.convertSetToSortedList(inputSet));
    }

    @Test
    void testConvertSetToSortedList_EmptySet() {
        Set<Integer> inputSet = Set.of();
        List<Integer> expected = List.of();

        assertEquals(expected, SetToSortedListConverter.convertSetToSortedList(inputSet));
    }
}

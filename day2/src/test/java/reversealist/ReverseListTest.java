package reversealist;

import static org.junit.jupiter.api.Assertions.*;

import listinterface.reversealist.ReverseList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ReverseListTest {

    @Test
    void testReverseArrayList() {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ReverseList.reverseList(arrayList);
        assertEquals(List.of(5, 4, 3, 2, 1), arrayList);
    }

    @Test
    void testReverseLinkedList() {
        List<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        ReverseList.reverseList(linkedList);
        assertEquals(List.of(50, 40, 30, 20, 10), linkedList);
    }

    @Test
    void testReverseEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        ReverseList.reverseList(emptyList);
        assertTrue(emptyList.isEmpty());
    }

    @Test
    void testReverseSingleElementList() {
        List<Integer> singleElementList = new ArrayList<>(List.of(42));
        ReverseList.reverseList(singleElementList);
        assertEquals(List.of(42), singleElementList);
    }
}

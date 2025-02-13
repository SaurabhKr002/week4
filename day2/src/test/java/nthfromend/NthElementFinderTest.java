package nthfromend;

import listinterface.nthfromend.NthElementFinder;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class NthElementFinderTest {

    @Test
    void testFindNthFromEnd_NormalCase() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", NthElementFinder.findNthFromEnd(list, 2));
    }

    @Test
    void testFindNthFromEnd_FirstElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("A", NthElementFinder.findNthFromEnd(list, 3));
    }

    @Test
    void testFindNthFromEnd_LastElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        assertEquals("Z", NthElementFinder.findNthFromEnd(list, 1));
    }

    @Test
    void testFindNthFromEnd_EmptyList() {
        LinkedList<String> list = new LinkedList<>();

        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            NthElementFinder.findNthFromEnd(list, 1);
        });

        assertEquals("N is larger than the size of the list.", exception.getMessage());
    }

    @Test
    void testFindNthFromEnd_NIsZero() {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NthElementFinder.findNthFromEnd(list, 0);
        });

        assertEquals("N must be greater than zero.", exception.getMessage()); // Updated assertion message
    }

    @Test
    void testFindNthFromEnd_NLargerThanSize() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            NthElementFinder.findNthFromEnd(list, 5);
        });

        assertEquals("N is larger than the size of the list.", exception.getMessage());
    }
}

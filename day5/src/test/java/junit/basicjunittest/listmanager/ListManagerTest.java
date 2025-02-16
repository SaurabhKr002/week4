package junit.basicjunittest.listmanager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    // Testing addElement method
    @Test
    void testAddElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);
        assertEquals(1, list.size(), "Adding element failed");

        manager.addElement(list, 20);
        assertEquals(2, list.size(), "Adding another element failed");
    }

    // Testing removeElement method
    @Test
    void testRemoveElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        assertTrue(manager.removeElement(list, 10), "Removing existing element failed");
        assertEquals(1, list.size(), "Size mismatch after removal");

        assertFalse(manager.removeElement(list, 30), "Removing non-existing element should return false");
    }

    // Testing getSize method
    @Test
    void testGetSize() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        assertEquals(0, manager.getSize(list), "Initial size should be 0");

        list.add(10);
        list.add(20);
        assertEquals(2, manager.getSize(list), "Size mismatch after adding elements");

        list.clear();
        assertEquals(0, manager.getSize(list), "Size should be 0 after clearing list");
    }
}

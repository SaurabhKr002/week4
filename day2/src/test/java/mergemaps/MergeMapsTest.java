// JUnit test for MergeMaps
package mergemaps;

import static org.junit.jupiter.api.Assertions.*;

import mapinterface.mergemaps.MergeMaps;
import org.junit.jupiter.api.Test;
import java.util.*;

class MergeMapsTest {
    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Saurabh", 1);
        map1.put("Anand", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Anand", 3);
        map2.put("Kuldeep", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Saurabh", 1);
        expected.put("Anand", 5);
        expected.put("Kuldeep", 4);

        assertEquals(expected, MergeMaps.merge(map1, map2));
    }

    @Test
    void testMergeWithEmptyMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Saurabh", 10);

        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Saurabh", 10);

        assertEquals(expected, MergeMaps.merge(map1, map2));
    }

    @Test
    void testMergeEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MergeMaps.merge(map1, map2).isEmpty());
    }
}

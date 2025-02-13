// JUnit test for InvertMap with order-independent assertion
package invertmap;

import static org.junit.jupiter.api.Assertions.*;

import mapinterface.invertmap.InvertMap;
import org.junit.jupiter.api.Test;
import java.util.*;

class InvertMapTest {
    @Test
    void testInvertMap() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Saurabh", 1);
        originalMap.put("Anand", 2);
        originalMap.put("Kuldeep", 1);

        // Running the method
        Map<Integer, List<String>> actual = InvertMap.invert(originalMap);

        // Expected result with HashSet to ignore order
        Map<Integer, Set<String>> expected = new HashMap<>();
        expected.put(1, new HashSet<>(Arrays.asList("Saurabh", "Kuldeep")));
        expected.put(2, new HashSet<>(Collections.singletonList("Anand")));

        // Convert actual list values to sets for comparison
        Map<Integer, Set<String>> actualSet = new HashMap<>();
        for (Map.Entry<Integer, List<String>> entry : actual.entrySet()) {
            actualSet.put(entry.getKey(), new HashSet<>(entry.getValue()));
        }

        // Assertion that ignores order
        assertEquals(expected, actualSet);
    }
}

package setoperations;

import setinterface.setoperations.SetOperations;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testUnion() {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);
        assertEquals(expected, SetOperations.union(set1, set2));
    }

    @Test
    void testIntersection() {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> expected = Set.of(3);
        assertEquals(expected, SetOperations.intersection(set1, set2));
    }

    @Test
    void testUnionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3));

        assertEquals(set2, SetOperations.union(set1, set2));
    }

    @Test
    void testIntersectionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3));

        assertTrue(SetOperations.intersection(set1, set2).isEmpty());
    }
}

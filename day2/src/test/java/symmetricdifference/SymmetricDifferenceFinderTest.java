package symmetricdifference;

import setinterface.symmetricdifference.SymmetricDifferenceFinder;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SymmetricDifferenceFinderTest {

    @Test
    void testSymmetricDifference_NormalCase() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        Set<Integer> expected = Set.of(1, 2, 4, 5);
        assertEquals(expected, SymmetricDifferenceFinder.findSymmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_DisjointSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(4, 5, 6);

        Set<Integer> expected = Set.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, SymmetricDifferenceFinder.findSymmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_IdenticalSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3);

        Set<Integer> expected = Set.of();
        assertEquals(expected, SymmetricDifferenceFinder.findSymmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_OneEmptySet() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of();

        Set<Integer> expected = Set.of(1, 2, 3);
        assertEquals(expected, SymmetricDifferenceFinder.findSymmetricDifference(set1, set2));
    }
}

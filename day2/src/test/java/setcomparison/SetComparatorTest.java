package setcomparison;

import org.junit.jupiter.api.Test;
import setinterface.setcomparison.SetComparator;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SetComparatorTest {

    @Test
    void testSetsAreEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        assertTrue(SetComparator.areSetsEqual(set1, set2), "Sets with same elements should be equal");
    }

    @Test
    void testSetsAreNotEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        assertFalse(SetComparator.areSetsEqual(set1, set2), "Different sets should not be equal");
    }

    @Test
    void testDifferentSizeSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        assertFalse(SetComparator.areSetsEqual(set1, set2), "Sets with different sizes should not be equal");
    }

    @Test
    void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(SetComparator.areSetsEqual(set1, set2), "Two empty sets should be equal");
    }

    @Test
    void testSetsWithDuplicates() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 2, 3)); // Using Arrays.asList to allow duplicates
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        assertTrue(SetComparator.areSetsEqual(set1, set2), "Sets with duplicate elements should still be equal");
    }
}

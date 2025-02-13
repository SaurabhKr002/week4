package subsetchecker;

import setinterface.subsetchecker.SubsetChecker;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SubsetCheckerTest {

    @Test
    void testIsSubset_ValidSubset() {
        Set<Integer> subset = new HashSet<>();
        subset.add(2);
        subset.add(3);

        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);
        mainSet.add(3);
        mainSet.add(4);

        assertTrue(SubsetChecker.isSubset(subset, mainSet));
    }

    @Test
    void testIsSubset_NotASubset() {
        Set<Integer> subset = new HashSet<>();
        subset.add(5);
        subset.add(6);

        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);
        mainSet.add(3);
        mainSet.add(4);

        assertFalse(SubsetChecker.isSubset(subset, mainSet));
    }

    @Test
    void testIsSubset_EmptySubset() {
        Set<Integer> subset = new HashSet<>();
        Set<Integer> mainSet = new HashSet<>();
        mainSet.add(1);
        mainSet.add(2);

        assertTrue(SubsetChecker.isSubset(subset, mainSet));
    }

    @Test
    void testIsSubset_IdenticalSets() {
        Set<Integer> subset = new HashSet<>();
        subset.add(1);
        subset.add(2);
        subset.add(3);

        Set<Integer> mainSet = new HashSet<>(subset);

        assertTrue(SubsetChecker.isSubset(subset, mainSet));
    }

    @Test
    void testIsSubset_MainSetEmpty() {
        Set<Integer> subset = new HashSet<>();
        subset.add(1);
        subset.add(2);

        Set<Integer> mainSet = new HashSet<>();

        assertFalse(SubsetChecker.isSubset(subset, mainSet));
    }
}

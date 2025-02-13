package setinterface.subsetchecker;

import java.util.Set;

public class SubsetChecker {
    public static <T> boolean isSubset(Set<T> subset, Set<T> mainSet) {
        return mainSet.containsAll(subset);
    }
}

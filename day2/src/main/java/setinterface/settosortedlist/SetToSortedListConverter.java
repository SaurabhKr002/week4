package setinterface.settosortedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedListConverter {
    public static List<Integer> convertSetToSortedList(Set<Integer> inputSet) {
        return new ArrayList<>(new TreeSet<>(inputSet)); // Ensures sorted order
    }
}

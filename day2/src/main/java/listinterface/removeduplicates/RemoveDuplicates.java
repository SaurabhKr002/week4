package listinterface.removeduplicates;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        Set<T> uniqueElements = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueElements);
    }
}

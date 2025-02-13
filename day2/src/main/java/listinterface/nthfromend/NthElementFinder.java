package listinterface.nthfromend;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class NthElementFinder {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than zero.");
        }

        var first = list.listIterator();
        var second = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new NoSuchElementException("N is larger than the size of the list.");
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}

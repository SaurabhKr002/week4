package setinterface.settosortedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(5);
        inputSet.add(3);
        inputSet.add(9);
        inputSet.add(1);

        List<Integer> sortedList = SetToSortedListConverter.convertSetToSortedList(inputSet);
        System.out.println("Sorted List: " + sortedList);
    }
}

package listinterface.removeduplicates;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("Original List: " + numbers);
        List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}

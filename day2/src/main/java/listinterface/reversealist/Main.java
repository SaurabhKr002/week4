package listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example with ArrayList
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        ReverseList.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Example with LinkedList
        List<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("\nOriginal LinkedList: " + linkedList);
        ReverseList.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        // Edge Case: Empty List
        List<Integer> emptyList = new ArrayList<>();
        System.out.println("\nOriginal Empty List: " + emptyList);
        ReverseList.reverseList(emptyList);
        System.out.println("Reversed Empty List: " + emptyList);

        // Edge Case: Single Element List
        List<Integer> singleElementList = new ArrayList<>(List.of(42));
        System.out.println("\nOriginal Single Element List: " + singleElementList);
        ReverseList.reverseList(singleElementList);
        System.out.println("Reversed Single Element List: " + singleElementList);
    }
}

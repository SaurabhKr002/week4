package setinterface.setcomparison;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements for Set 1 (comma-separated): ");
        String[] elements1 = scanner.nextLine().split(",");
        for (String element : elements1) {
            set1.add(Integer.parseInt(element.trim()));
        }

        System.out.println("Enter elements for Set 2 (comma-separated): ");
        String[] elements2 = scanner.nextLine().split(",");
        for (String element : elements2) {
            set2.add(Integer.parseInt(element.trim()));
        }

        boolean result = SetComparator.areSetsEqual(set1, set2);
        System.out.println("Are both sets equal? " + result);
    }
}

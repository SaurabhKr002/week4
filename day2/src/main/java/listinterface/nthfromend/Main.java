package listinterface.nthfromend;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter elements of the list (comma-separated): ");
        String input = scanner.nextLine();
        String[] elements = input.split(",");
        for (String element : elements) {
            list.add(element.trim());
        }

        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the value of N (must be a positive integer): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: N must be greater than zero.");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        try {
            String result = NthElementFinder.findNthFromEnd(list, n);
            System.out.println("The " + n + "th element from the end is: " + result);
        } catch (IllegalArgumentException | java.util.NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

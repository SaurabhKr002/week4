package exceptionhandling.multiplecatch;

import java.util.Scanner;

public class ArrayOperations {
    public static String getValueAtIndex(int[] array, int index) {
        try {
            return "Value at index " + index + ": " + array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Invalid index!";
        } catch (NullPointerException e) {
            return "Array is not initialized!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        int[] validArray = {10, 20, 30, 40, 50};
        int[] nullArray = null;

        System.out.println(getValueAtIndex(validArray, 2)); // Expected: Value at index 2: 30
        System.out.println(getValueAtIndex(validArray, 10)); // Expected: Invalid index!
        System.out.println(getValueAtIndex(nullArray, 1)); // Expected: Array is not initialized!

        scanner.close();
    }
}

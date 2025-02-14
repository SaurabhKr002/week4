package exceptionhandling.nestedtry;

import java.util.Scanner;

public class NestedTryCatch {
    public static void divideElement(int[] arr, int index, int divisor) {
        try {
            try {
                int value = arr[index]; // May throw ArrayIndexOutOfBoundsException
                try {
                    int result = value / divisor; // May throw ArithmeticException
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        divideElement(numbers, index, divisor);

        scanner.close();
    }
}

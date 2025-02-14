package exceptionhandling.finallyblock;

import java.util.Scanner;

public class DivisionWithFinally {

    public static int divide(int a, int b) {
        try {
            return a / b;  // May throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return -1; // Return a default error value
        } finally {
            System.out.println("Operation completed.");  // Always executes
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denom = scanner.nextInt();

        int result = divide(num, denom);
        if (result != -1) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

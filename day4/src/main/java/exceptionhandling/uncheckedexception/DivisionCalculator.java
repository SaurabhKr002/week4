package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

    public static double divideNumbers(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = divideNumbers(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

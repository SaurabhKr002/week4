package exceptionhandling.exceptionpropagation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter principal amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter interest rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // Calling the method
            double interest = InterestCalculator.calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Handling exception
        } finally {
            scanner.close();
        }
    }
}

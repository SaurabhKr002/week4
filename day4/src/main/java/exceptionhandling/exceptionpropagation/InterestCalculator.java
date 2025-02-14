package exceptionhandling.exceptionpropagation;

public class InterestCalculator {

    // Method that throws IllegalArgumentException if input values are invalid
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be non-negative.");
        }
        return amount * rate * years / 100; // Simple interest calculation
    }
}

package exceptionhandling.customexception;

public class AgeValidator {
    // Method to validate age
    public static String validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        return "Access granted!";
    }
}

package exceptionhandling.customexception;

// Custom exception class for invalid age
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

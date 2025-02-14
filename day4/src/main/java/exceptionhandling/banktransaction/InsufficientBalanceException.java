package exceptionhandling.banktransaction;

// Custom Exception: InsufficientBalanceException
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

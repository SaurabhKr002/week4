package junit.basicjunittest.exceptionhandling;

public class ExceptionHandler {
    // Method to perform division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

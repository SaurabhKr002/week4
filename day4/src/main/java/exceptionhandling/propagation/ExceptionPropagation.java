package exceptionhandling.propagation;

public class ExceptionPropagation {

    // Method 1: Throws an ArithmeticException
    public static void method1() {
        int result = 10 / 0; // Throws ArithmeticException
    }

    // Method 2: Calls method1()
    public static void method2() {
        method1(); // Exception propagates to method2()
    }

    // Main method: Calls method2() and handles the exception
    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}

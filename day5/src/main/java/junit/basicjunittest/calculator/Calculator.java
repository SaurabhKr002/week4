package junit.basicjunittest.calculator;

public class Calculator {
    // Adds two numbers and returns the result
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from the first and returns the result
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers and returns the result
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by the second and returns the result
    // Throws ArithmeticException if division by zero occurs
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

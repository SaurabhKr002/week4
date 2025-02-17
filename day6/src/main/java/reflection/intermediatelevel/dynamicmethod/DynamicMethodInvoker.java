package reflection.intermediatelevel.dynamicmethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Load class dynamically
            Class<?> mathClass = Class.forName("reflection.intermediatelevel.dynamicmethod.MathOperations");
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Take user input for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            // Take user input for parameters
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the method dynamically
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathInstance, num1, num2);

            // Print result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

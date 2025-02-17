package reflection.basiclevel.privatemethod;

import java.lang.reflect.Method;

public class ReflectionInvoker {

    // Method to invoke private multiply() method
    public static int invokeMultiply(Calculator calculator, int a, int b) {
        try {
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow invocation
            return (int) multiplyMethod.invoke(calculator, a, b);
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke private method", e);
        }
    }
}

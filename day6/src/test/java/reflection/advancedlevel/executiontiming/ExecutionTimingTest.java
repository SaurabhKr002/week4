package reflection.advancedlevel.executiontiming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ExecutionTimingTest {

    @Test
    public void testMethodExecutionTime() {
        // Create an instance of the SampleClass
        Task sampleClass = new SampleClass();

        // Create a proxy for the SampleClass instance
        Task proxy = (Task) ExecutionTimingInterceptor.createProxy(sampleClass);

        // Test the method that simulates work
        assertDoesNotThrow(() -> proxy.doWork());

        // Test the method that calculates sum
        int result = proxy.calculateSum(5, 10);
        assertDoesNotThrow(() -> System.out.println("Sum: " + result));
    }
}

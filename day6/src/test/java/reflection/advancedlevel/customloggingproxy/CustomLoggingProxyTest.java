package reflection.advancedlevel.customloggingproxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CustomLoggingProxyTest {

    @Test
    public void testLoggingProxy() {
        // Create an instance of the original Greeting implementation
        Greeting greeting = new GreetingImpl();

        // Create a proxy instance with logging functionality
        Greeting proxy = (Greeting) LoggingHandler.createProxy(greeting);

        // Use the proxy to invoke the sayHello method
        assertDoesNotThrow(() -> proxy.sayHello("Saurabh"));

        // The console output will log the method call before execution
        // "Calling method: sayHello"
        // "Hello, Saurabh!"
    }
}

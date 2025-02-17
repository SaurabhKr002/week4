package reflection.advancedlevel.dependencyinjection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class DIContainerTest {

    @Test
    public void testDependencyInjection() {
        // Create an instance of ServiceB, which requires ServiceA to be injected
        ServiceB serviceB = new ServiceB();

        // Inject the dependencies
        DIContainer.inject(serviceB);

        // Assert that the method runs without any exceptions
        assertDoesNotThrow(() -> serviceB.serve());

        // The console output will show:
        // "ServiceB is calling ServiceA:"
        // "ServiceA is serving..."
    }
}

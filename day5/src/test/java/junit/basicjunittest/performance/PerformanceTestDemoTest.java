package junit.basicjunittest.performance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTestDemoTest {

    PerformanceTestDemo obj = new PerformanceTestDemo();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test will fail if execution exceeds 2 seconds
    void testLongRunningTask() {
        assertThrows(Exception.class, () -> obj.longRunningTask());
    }
}

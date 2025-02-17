package annotations.practiceproblems.advancedlevel.customcaching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CacheProcessorTest {

    @Test
    void testCaching() {
        ExpensiveService service = new ExpensiveServiceImpl();
        ExpensiveService proxyService = CacheProcessor.createProxy(service);

        long firstCall = proxyService.factorial(5);
        long secondCall = proxyService.factorial(5);

        assertEquals(120, firstCall);
        assertEquals(120, secondCall);
    }
}

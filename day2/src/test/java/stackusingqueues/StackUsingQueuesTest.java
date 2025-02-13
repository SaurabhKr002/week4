package stackusingqueues;

import static org.junit.jupiter.api.Assertions.*;

import queueinterface.stackusingqueues.StackUsingQueues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackUsingQueuesTest {
    private StackUsingQueues stack;

    @BeforeEach
    void setUp() {
        stack = new StackUsingQueues();
    }

    @Test
    void testPushAndTop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.top()); // Top element should be 3
    }

    @Test
    void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop()); // Pop should return 3
        assertEquals(2, stack.top()); // Now top should be 2
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty()); // Stack should be empty initially
        stack.push(5);
        assertFalse(stack.isEmpty()); // Stack should not be empty after push
        stack.pop();
        assertTrue(stack.isEmpty()); // Stack should be empty after popping all elements
    }
}

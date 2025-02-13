package reverseaqueue;

import queueinterface.reverseaqueue.ReverseQueue;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseQueueTest {

    @Test
    public void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(30);
        expectedQueue.add(20);
        expectedQueue.add(10);

        assertEquals(expectedQueue, reversedQueue, "Queue should be reversed."); // Verify expected output
    }

    @Test
    public void testReverseEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

        assertTrue(reversedQueue.isEmpty(), "Reversed queue should be empty."); // Check for empty queue
    }

    @Test
    public void testReverseSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);

        Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(5);

        assertEquals(expectedQueue, reversedQueue, "Queue with one element should remain unchanged."); // Verify single element
    }
}

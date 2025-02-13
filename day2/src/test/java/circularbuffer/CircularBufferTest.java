// JUnit test for Circular Buffer
package circularbuffer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queueinterface.circularbuffer.CircularBuffer;

class CircularBufferTest {
    @Test
    void testCircularBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Overwrites 1

        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, buffer.getBufferContents());
    }
}

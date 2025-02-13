package pipedstreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class DataStreamTest {

    @Test
    void testPipedStreamCommunication() throws IOException {
        PipedOutputStream testOutput = new PipedOutputStream();
        PipedInputStream testInput = new PipedInputStream(testOutput);

        String testMessage = "Test Message";
        testOutput.write(testMessage.getBytes());

        byte[] buffer = new byte[1024];
        int length = testInput.read(buffer);
        String receivedMessage = new String(buffer, 0, length);

        assertEquals(testMessage, receivedMessage);

        testOutput.close();
        testInput.close();
    }
}

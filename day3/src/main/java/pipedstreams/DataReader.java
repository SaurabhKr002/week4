package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

class DataReader extends Thread {
    private PipedInputStream inputStream;

    public DataReader(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int length = inputStream.read(buffer);
            String receivedMessage = new String(buffer, 0, length);
            System.out.println("Data read: " + receivedMessage);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

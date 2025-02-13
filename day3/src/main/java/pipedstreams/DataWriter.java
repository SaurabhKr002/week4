package pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

class DataWriter extends Thread {
    private PipedOutputStream outputStream;

    public DataWriter(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());
            System.out.println("Data written: " + message);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

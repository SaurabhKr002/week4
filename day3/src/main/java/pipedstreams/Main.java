package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            DataWriter writer = new DataWriter(outputStream);
            DataReader reader = new DataReader(inputStream);

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Main Error: " + e.getMessage());
        }
    }
}

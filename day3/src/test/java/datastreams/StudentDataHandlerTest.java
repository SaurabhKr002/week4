package datastreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class StudentDataHandlerTest {

    @Test
    void testWriteAndReadStudentData() throws IOException {
        String testFile = "test_students.dat";

        // Writing test data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(testFile))) {
            dos.writeInt(201);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);
        }

        // Reading and verifying test data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(testFile))) {
            assertEquals(201, dis.readInt());
            assertEquals("Charlie", dis.readUTF());
            assertEquals(3.9, dis.readDouble(), 0.01);
        }
    }
}

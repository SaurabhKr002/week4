package filestreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FileCopierTest {
    @Test
    void testBufferedCopyEfficiency() {
        String source = "test_large_file.dat";
        String unbufferedDest = "test_unbuffered.dat";
        String bufferedDest = "test_buffered.dat";

        try (FileOutputStream fos = new FileOutputStream(source)) {
            byte[] data = new byte[100 * 1024 * 1024]; // 100MB dummy file
            fos.write(data);
        } catch (IOException e) {
            fail("Failed to create test file.");
        }

        FileCopier.copyFileUnbuffered(source, unbufferedDest);
        FileCopier.copyFileBuffered(source, bufferedDest);

        File unbufferedFile = new File(unbufferedDest);
        File bufferedFile = new File(bufferedDest);

        assertTrue(unbufferedFile.exists(), "Unbuffered copy should exist.");
        assertTrue(bufferedFile.exists(), "Buffered copy should exist.");
        assertEquals(unbufferedFile.length(), bufferedFile.length(), "Files should have the same size.");

        // Cleanup
        new File(source).delete();
        unbufferedFile.delete();
        bufferedFile.delete();
    }
}

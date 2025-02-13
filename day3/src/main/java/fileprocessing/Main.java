package fileprocessing;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Txt_Files\\500MB_error.txt";
        FileProcessor processor = new FileProcessor(filePath);
        processor.processFile();
    }
}

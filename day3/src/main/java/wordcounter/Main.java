package wordcounter;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Txt_Files\\hello1.txt"; // Input file
        int topN = 5; // Number of top words to display

        WordCounter.countTopWords(filePath, topN);
    }
}

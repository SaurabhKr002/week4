package filterstreams;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "D:\\Capg\\week4\\day3\\src\\main\\java\\filterstreams\\source.txt";
        String outputFilePath = "D:\\Capg\\week4\\day3\\src\\main\\java\\filterstreams\\target.txt"; // File where converted text will be saved

        // Convert uppercase to lowercase and write to a new file
        TextConverter.convertUppercaseToLowercase(inputFilePath, outputFilePath);
    }
}

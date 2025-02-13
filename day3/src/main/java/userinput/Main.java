package userinput;

public class Main {
    public static void main(String[] args) {
        String[] userData = UserInputHandler.getUserInput();
        UserInputHandler.saveToFile(userData);
    }
}

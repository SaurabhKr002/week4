package annotations.exercises.usedeprecated;

// Main class to test the methods
public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method (should show a warning)
        api.oldFeature();

        // Calling the new method
        api.newFeature();
    }
}

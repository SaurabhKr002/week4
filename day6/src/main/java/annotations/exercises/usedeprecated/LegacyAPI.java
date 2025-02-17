package annotations.exercises.usedeprecated;

// Legacy API class with an old deprecated method
class LegacyAPI {

    // Marking this method as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature. Please use newFeature() instead.");
    }

    // New recommended method
    public void newFeature() {
        System.out.println("This is the new feature with improved functionality.");
    }
}

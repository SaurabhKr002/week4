package mealplan;

import java.util.List;

// Generic class for meal generation
public class MealGenerator<T extends MealPlan> {

    private final List<T> availableMeals;

    public MealGenerator(List<T> availableMeals) {
        this.availableMeals = availableMeals;
    }

    // Generic method to generate a meal plan dynamically
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated Meal Plan: " + meal.getMealDetails());
    }

    // Method to display all available meal plans
    public void displayAvailableMeals() {
        System.out.println("\nAvailable Meal Plans:");
        for (MealPlan meal : availableMeals) {
            System.out.println("- " + meal.getMealDetails());
        }
    }
}

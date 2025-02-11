package mealplan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Personalized Meal Plan Generator:");
        System.out.println("----------------------------------");

        // Creating meal plan objects
        VegetarianMeal vegetarian = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal highProtein = new HighProteinMeal();

        // Generating meal plans
        MealGenerator.generateMealPlan(vegetarian);
        MealGenerator.generateMealPlan(vegan);
        MealGenerator.generateMealPlan(keto);
        MealGenerator.generateMealPlan(highProtein);

        // Displaying available meals
        MealGenerator<MealPlan> mealPlanList = new MealGenerator<>(
                Arrays.asList(vegetarian, vegan, keto, highProtein)
        );
        mealPlanList.displayAvailableMeals();
    }
}

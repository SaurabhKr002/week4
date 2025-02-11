package mealplan;

// Represents a Vegan Meal
public class VeganMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegan Meal: Includes plant-based ingredients, no animal products.";
    }
}

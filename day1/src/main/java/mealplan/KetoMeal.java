package mealplan;

// Represents a Keto Meal
public class KetoMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Keto Meal: High in fats, low in carbohydrates.";
    }
}

package mealplan;

// Represents a Vegetarian Meal
public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegetarian Meal: Includes fresh vegetables, grains, and dairy.";
    }
}

package mealplan;

// Represents a High-Protein Meal
public class HighProteinMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "High-Protein Meal: Focuses on lean meats, eggs, and legumes.";
    }
}

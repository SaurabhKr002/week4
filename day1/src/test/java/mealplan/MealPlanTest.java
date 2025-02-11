package mealplan;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MealPlanTest {

    @Test
    void testVegetarianMeal() {
        MealPlan vegetarian = new VegetarianMeal();
        assertEquals("Vegetarian Meal: Includes fresh vegetables, grains, and dairy.", vegetarian.getMealDetails());
    }

    @Test
    void testVeganMeal() {
        MealPlan vegan = new VeganMeal();
        assertEquals("Vegan Meal: Includes plant-based ingredients, no animal products.", vegan.getMealDetails());
    }

    @Test
    void testKetoMeal() {
        MealPlan keto = new KetoMeal();
        assertEquals("Keto Meal: High in fats, low in carbohydrates.", keto.getMealDetails());
    }

    @Test
    void testHighProteinMeal() {
        MealPlan highProtein = new HighProteinMeal();
        assertEquals("High-Protein Meal: Focuses on lean meats, eggs, and legumes.", highProtein.getMealDetails());
    }

    @Test
    void testMealGenerator() {
        List<MealPlan> meals = Arrays.asList(new VegetarianMeal(), new VeganMeal(), new KetoMeal(), new HighProteinMeal());
        MealGenerator<MealPlan> mealGenerator = new MealGenerator<>(meals);

        assertNotNull(mealGenerator);
        assertEquals(4, meals.size());
    }
}

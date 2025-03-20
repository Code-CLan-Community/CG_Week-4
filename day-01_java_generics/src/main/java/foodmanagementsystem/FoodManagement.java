package foodmanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Interface representing different meal plans
interface MealType {
    String getMealName();
}

// Specific meal categories
class VegetarianMeal implements MealType {
    private final String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealType {
    private final String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealType {
    private final String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }
}

// Generic class to manage meals
class MealPlanManager<T extends MealType> {
    private final List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public List<T> getMealList() {
        return mealList;
    }
}

// Utility class to generate meal plans
class MealPlanGenerator {
    public static <T extends MealType> void generatePlan(T meal) {
        System.out.println("Generated Meal Plan: " + meal.getMealName());
    }
}

public class FoodManagement {
    public static void main(String[] args) {
        // Create meal plans
        MealPlanManager<VegetarianMeal> vegetarianPlan = new MealPlanManager<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Grilled Vegetables"));
        vegetarianPlan.addMeal(new VegetarianMeal("Paneer Curry"));

        MealPlanManager<VeganMeal> veganPlan = new MealPlanManager<>();
        veganPlan.addMeal(new VeganMeal("Tofu Stir Fry"));

        // Generate personalized meal plans
        MealPlanGenerator.generatePlan(new VegetarianMeal("Vegetable Salad"));
        MealPlanGenerator.generatePlan(new KetoMeal("Grilled Chicken & Avocado"));
    }
}

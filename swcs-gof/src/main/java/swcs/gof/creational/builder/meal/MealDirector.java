package swcs.gof.creational.builder.meal;

public class MealDirector {

    public Meal createMeal(MealBuilder builder) {
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();

        return builder.meal();
    }
}
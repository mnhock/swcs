package swcs.gof.creational.builder.meal;

public class Client {

    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder builder;
        boolean isKid = false;

        if (isKid) {
            builder = new KidsMealBuilder();
        } else {
            builder = new AdultMealBuilder();
        }

        Meal meal = director.createMeal(builder);
        System.out.println(meal.main());
    }
}

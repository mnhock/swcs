package swcs.gof.creational.builder;

public class AdultMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        // add drinks to the meal
    }

    @Override
    public void buildMain() {
        // add main part of the meal
    }

    @Override
    public void buildDessert() {
        // add dessert part to the meal
    }

    @Override
    public Meal getMeal() {
        this.meal.setType("Adult");
        return this.meal;
    }
}

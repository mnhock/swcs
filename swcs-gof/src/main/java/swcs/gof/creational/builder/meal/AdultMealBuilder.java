package swcs.gof.creational.builder.meal;

public class AdultMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        meal().drink("Adult drink");
    }

    @Override
    public void buildMain() {
        meal().main("Adult main");
    }

    @Override
    public void buildDessert() {
        meal().dessert("Adult dessert");
    }

}

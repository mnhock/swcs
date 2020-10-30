package swcs.gof.creational.builder;

public class AdultMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        getMeal().setDrink("Adult drink");
    }

    @Override
    public void buildMain() {
        getMeal().setMain("Adult main");
    }

    @Override
    public void buildDessert() {
        getMeal().setDessert("Adult dessert");
    }

}

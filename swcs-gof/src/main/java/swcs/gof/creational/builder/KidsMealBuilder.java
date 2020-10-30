package swcs.gof.creational.builder;

public class KidsMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        getMeal().setDrink("Kids drink");
    }

    @Override
    public void buildMain() {
        getMeal().setMain("Kids main");
    }

    @Override
    public void buildDessert() {
        getMeal().setDessert("Kids dessert");
    }

}
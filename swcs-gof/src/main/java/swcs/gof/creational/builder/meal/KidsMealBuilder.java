package swcs.gof.creational.builder.meal;

public class KidsMealBuilder extends MealBuilder {

    @Override
    public void buildDrink() {
        meal().drink("Kids drink");
    }

    @Override
    public void buildMain() {
        meal().main("Kids main");
    }

    @Override
    public void buildDessert() {
        meal().dessert("Kids dessert");
    }

}
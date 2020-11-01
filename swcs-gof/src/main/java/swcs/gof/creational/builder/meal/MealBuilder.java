package swcs.gof.creational.builder.meal;

public abstract class MealBuilder {

    private final Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public abstract void buildDrink();

    public abstract void buildMain();

    public abstract void buildDessert();

    public Meal getMeal() {
        return this.meal;
    }
}
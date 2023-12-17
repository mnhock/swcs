package swcs.gof.creational.builder.meal;

public abstract class MealBuilder {

    private final Meal meal;

    protected MealBuilder() {
        this.meal = new Meal();
    }

    public abstract void buildDrink();

    public abstract void buildMain();

    public abstract void buildDessert();

    public Meal meal() {
        return this.meal;
    }
}
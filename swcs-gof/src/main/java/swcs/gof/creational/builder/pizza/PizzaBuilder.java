package swcs.gof.creational.builder.pizza;

abstract class PizzaBuilder {
    private final Pizza pizza;

    PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public Pizza pizza() {
        return this.pizza;
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
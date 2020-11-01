package swcs.gof.creational.builder.pizza;

abstract class PizzaBuilder {
    private final Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
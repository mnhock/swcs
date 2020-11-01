package swcs.gof.creational.builder.pizza;

class Luigi {
    private final PizzaBuilder pizzaBuilder;

    public Luigi(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }

    public void bakePizza() {
        this.pizzaBuilder.buildDough();
        this.pizzaBuilder.buildSauce();
        this.pizzaBuilder.buildTopping();
    }
}
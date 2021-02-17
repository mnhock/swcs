package swcs.gof.creational.builder.pizza;

class Luigi {
    private final PizzaBuilder pizzaBuilder;

    public Luigi(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza bakePizza() {
        this.pizzaBuilder.buildDough();
        this.pizzaBuilder.buildSauce();
        this.pizzaBuilder.buildTopping();

        return this.pizzaBuilder.pizza();
    }
}
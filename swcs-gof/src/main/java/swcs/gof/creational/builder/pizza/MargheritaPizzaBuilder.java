package swcs.gof.creational.builder.pizza;

class MargheritaPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        this.getPizza().setDough("cross");
    }

    @Override
    public void buildSauce() {
        this.getPizza().setSauce("mild");
    }

    @Override
    public void buildTopping() {
    }
}

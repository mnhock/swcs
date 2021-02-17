package swcs.gof.creational.builder.pizza;

class MargheritaPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        this.pizza().dough("cross");
    }

    @Override
    public void buildSauce() {
        this.pizza().sauce("mild");
    }

    @Override
    public void buildTopping() {
    }
}

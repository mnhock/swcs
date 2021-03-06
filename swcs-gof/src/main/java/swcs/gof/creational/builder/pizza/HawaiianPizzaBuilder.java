package swcs.gof.creational.builder.pizza;

class HawaiianPizzaBuilder extends PizzaBuilder {

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
        this.pizza().topping("ham+pineapple");
    }
}

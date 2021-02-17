package swcs.gof.creational.builder.pizza;

class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        this.pizza().setDough("cross");
    }

    @Override
    public void buildSauce() {
        this.pizza().setSauce("mild");
    }

    @Override
    public void buildTopping() {
        this.pizza().setTopping("ham+pineapple");
    }
}

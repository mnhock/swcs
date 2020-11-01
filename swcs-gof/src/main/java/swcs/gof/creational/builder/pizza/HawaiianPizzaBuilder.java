package swcs.gof.creational.builder.pizza;

class HawaiianPizzaBuilder extends PizzaBuilder {

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
        this.getPizza().setTopping("ham+pineapple");
    }
}

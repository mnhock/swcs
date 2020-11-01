package swcs.gof.creational.builder.pizza;

public class BuilderTester {

    public static void main(String[] args) {
        Luigi luigi = new Luigi(new HawaiianPizzaBuilder());
        luigi.bakePizza();

        Pizza pizza = luigi.getPizza();
    }

}

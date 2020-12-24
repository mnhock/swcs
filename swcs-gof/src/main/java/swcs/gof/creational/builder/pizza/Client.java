package swcs.gof.creational.builder.pizza;

public class Client {

    public static void main(String[] args) {
        Luigi luigi = new Luigi(new HawaiianPizzaBuilder());
        Pizza pizza = luigi.bakePizza();
    }

}

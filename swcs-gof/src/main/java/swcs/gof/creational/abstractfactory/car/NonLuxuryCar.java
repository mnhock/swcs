package swcs.gof.creational.abstractfactory.car;

public class NonLuxuryCar implements Car {

    private final String name;

    public NonLuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String features() {
        return "Non-Luxury Car Features ";
    }

}

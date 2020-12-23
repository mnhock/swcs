package swcs.gof.creational.abstractfactory.car;

public class NonLuxuryCar implements Car {

    private final String name;

    public NonLuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFeatures() {
        return "Non-Luxury Car Features ";
    }

}

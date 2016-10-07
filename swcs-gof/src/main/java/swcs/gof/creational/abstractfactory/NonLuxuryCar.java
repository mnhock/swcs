package swcs.gof.creational.abstractfactory;

public class NonLuxuryCar implements Car {

    private final String name;

    public NonLuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return this.name;
    }

    @Override
    public String getCarFeatures() {
        return "Non-Luxury Car Features ";
    }

}

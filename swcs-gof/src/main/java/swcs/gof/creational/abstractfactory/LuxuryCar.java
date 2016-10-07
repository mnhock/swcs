package swcs.gof.creational.abstractfactory;

public class LuxuryCar implements Car {

    private final String name;

    public LuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return this.name;
    }

    @Override
    public String getCarFeatures() {
        return "Luxury Car Features ";
    }

}

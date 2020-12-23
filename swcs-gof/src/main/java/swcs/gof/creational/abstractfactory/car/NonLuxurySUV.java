package swcs.gof.creational.abstractfactory.car;

public class NonLuxurySUV implements SUV {

    private final String name;

    public NonLuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFeatures() {
        return "Non-Luxury SUV Features ";
    }

}

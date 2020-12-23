package swcs.gof.creational.abstractfactory.car;

public class LuxurySUV implements SUV {

    private final String name;

    public LuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFeatures() {
        return "Luxury SUV Features ";
    }

}

package swcs.gof.creational.abstractfactory.car;

public class NonLuxurySUV implements SUV {

    private final String name;

    public NonLuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String features() {
        return "Non-Luxury SUV Features ";
    }

}

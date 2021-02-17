package swcs.gof.creational.abstractfactory.car;

public class LuxurySUV implements SUV {

    private final String name;

    public LuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String features() {
        return "Luxury SUV Features ";
    }

}

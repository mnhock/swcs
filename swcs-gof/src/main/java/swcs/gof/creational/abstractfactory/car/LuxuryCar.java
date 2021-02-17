package swcs.gof.creational.abstractfactory.car;

public class LuxuryCar implements Car {

    private final String name;

    public LuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String features() {
        return "Luxury Car Features ";
    }

}

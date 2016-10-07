package swcs.gof.creational.abstractfactory;

public class NonLuxurySUV implements SUV {

    private final String name;

    public NonLuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return this.name;
    }

    @Override
    public String getSUVFeatures() {
        return "Non-Luxury SUV Features ";
    }

}

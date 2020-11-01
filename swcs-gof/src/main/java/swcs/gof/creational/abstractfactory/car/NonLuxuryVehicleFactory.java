package swcs.gof.creational.abstractfactory.car;

public class NonLuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }

    @Override
    public SUV getSUV() {
        return new NonLuxurySUV("NL-S");
    }
}

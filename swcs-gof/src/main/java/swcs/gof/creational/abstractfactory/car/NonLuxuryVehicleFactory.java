package swcs.gof.creational.abstractfactory.car;

public class NonLuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car car() {
        return new NonLuxuryCar("NL-C");
    }

    @Override
    public SUV suv() {
        return new NonLuxurySUV("NL-S");
    }
}

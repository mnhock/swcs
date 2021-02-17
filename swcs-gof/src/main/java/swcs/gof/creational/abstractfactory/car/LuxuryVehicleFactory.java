package swcs.gof.creational.abstractfactory.car;

public class LuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car car() {
        return new LuxuryCar("L-C");
    }

    @Override
    public SUV suv() {
        return new LuxurySUV("L-S");
    }
}

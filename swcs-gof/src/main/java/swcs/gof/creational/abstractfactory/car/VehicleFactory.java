package swcs.gof.creational.abstractfactory.car;

public abstract class VehicleFactory {

    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "Non-Luxury";

    public abstract Car car();

    public abstract SUV suv();

    public static VehicleFactory vehicleFactory(String type) {
        if (VehicleFactory.LUXURY_VEHICLE.equals(type)) {
            return new LuxuryVehicleFactory();
        }
        if (VehicleFactory.NON_LUXURY_VEHICLE.equals(type)) {
            return new NonLuxuryVehicleFactory();
        }

        return new LuxuryVehicleFactory();
    }
}
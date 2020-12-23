package swcs.gof.creational.abstractfactory.car;

public class Client {

    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactory.getVehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);

        Car car = factory.getCar();
        System.out.println("Name: " + car.getName() + "  Features: " + car.getFeatures());

        SUV suv = factory.getSUV();
        System.out.println("Name: " + suv.getName() + "  Features: " + suv.getFeatures());
    }
}

package swcs.gof.creational.abstractfactory;

public class VehicleFactoryTester {

    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactory.getVehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);

        Car car = factory.getCar();
        System.out.println("Name: " + car.getCarName() + "  Features: " + car.getCarFeatures());

        SUV suv = factory.getSUV();
        System.out.println("Name: " + suv.getSUVName() + "  Features: " + suv.getSUVFeatures());
    }
}

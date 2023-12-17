package swcs.gof.creational.abstractfactory.car;

class Client {

    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactory.vehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);

        Car car = factory.car();
        System.out.println("Name: " + car.name() + "  Features: " + car.features());

        SUV suv = factory.suv();
        System.out.println("Name: " + suv.name() + "  Features: " + suv.features());
    }
}

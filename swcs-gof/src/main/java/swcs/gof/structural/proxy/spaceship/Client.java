package swcs.gof.structural.proxy.spaceship;

class Client {

    public static void main(String[] args) {
        Spaceship ship = new MillenniumFalconProxy(new Pilot("Han Solo"));
        ship.fly();

        ship = new MillenniumFalconProxy(new Pilot("Darth Vader"));
        ship.fly();
    }
}

package swcs.gof.structural.proxy.spaceship;

public final class MillenniumFalconProxy implements Spaceship {

    private final Pilot pilot;
    private final Spaceship ship;

    public MillenniumFalconProxy(Pilot pilot) {
        this.pilot = pilot;
        this.ship = new MillenniumFalcon();
    }

    @Override
    public void fly() {
        if ("Han Solo".equals(this.pilot.name())) {
            this.ship.fly();
        } else {
            System.out.printf("Sorry %s, only Han Solo can fly the Falcon!%n", this.pilot.name());
        }
    }
}
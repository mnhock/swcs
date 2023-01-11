package swcs.gof.behavioral.mediator.aircraft;

public final class Aircraft implements AircraftColleague {

    private final AircraftMediator mediator;
    private final String flightName;

    public Aircraft(AircraftMediator mediator, String flightName) {
        this.mediator = mediator;
        this.flightName = flightName;
    }

    @Override
    public void startLanding() {
        String runway = this.mediator.allotRunway(this);

        if (runway == null) {
            System.out.println("Due to traffic, there's a delay in landing of " + this.flightName);
        } else {
            System.out.println("Currently landing " + this.flightName + " on " + runway);
        }
    }

    @Override
    public void finishLanding() {
        System.out.println(this.flightName + " landed successfully");
        this.mediator.releaseRunway(this);
    }
}
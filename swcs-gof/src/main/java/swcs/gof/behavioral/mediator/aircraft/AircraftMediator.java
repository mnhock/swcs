package swcs.gof.behavioral.mediator.aircraft;

public interface AircraftMediator {

    void registerRunway(Runway runway);

    String allotRunway(Aircraft aircraft);

    void releaseRunway(Aircraft aircraft);
}

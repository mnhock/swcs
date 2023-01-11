package swcs.gof.behavioral.mediator.aircraft;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class AircraftTrafficControlRoom implements AircraftMediator {

    private final LinkedList<Runway> availableRunways;
    private final Map<Aircraft, Runway> aircraftRunways;

    public AircraftTrafficControlRoom() {
        this.availableRunways = new LinkedList<>();
        this.aircraftRunways = new HashMap<>();
    }

    @Override
    public void registerRunway(Runway runway) {
        this.availableRunways.add(runway);
    }

    @Override
    public String allotRunway(Aircraft aircraft) {
        Runway nextAvailableRunway = null;

        if (!this.availableRunways.isEmpty()) {
            nextAvailableRunway = this.availableRunways.removeFirst();
            this.aircraftRunways.put(aircraft, nextAvailableRunway);
        }

        return nextAvailableRunway == null ? null : nextAvailableRunway.name();
    }

    @Override
    public void releaseRunway(Aircraft aircraft) {
        if (this.aircraftRunways.containsKey(aircraft)) {
            Runway runway = this.aircraftRunways.remove(aircraft);
            this.availableRunways.add(runway);
        }
    }
}
package swcs.gof.behavioral.meditor.aircraft;

public class Client {

    public static void main(String[] args) {
        AircraftMediator mediator = new AircraftTrafficControlRoom();
        mediator.registerRunway(new Runway("Runway A"));

        AircraftColleague wrightFlight = new Aircraft(mediator, "Wright Flight");
        AircraftColleague airbusA320 = new Aircraft(mediator, "Airbus A320");

        wrightFlight.startLanding();
        airbusA320.startLanding();
        wrightFlight.finishLanding();
    }
}

package swcs.gof.behavioral.mediator.aircraft;

public final class Runway {

    private final String name;

    public Runway(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}

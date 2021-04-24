package swcs.gof.structural.proxy.spaceship;

public final class Pilot {

    private final String name;

    public Pilot(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
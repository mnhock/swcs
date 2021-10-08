package swcs.gof.behavioral.iterator.extern.cars;

public final class Car {

    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
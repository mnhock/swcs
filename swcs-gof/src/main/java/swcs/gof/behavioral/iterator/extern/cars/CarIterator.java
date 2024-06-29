package swcs.gof.behavioral.iterator.extern.cars;

public class CarIterator implements java.util.Iterator<Car> {

    private final Car[] cars;
    private int index;

    public CarIterator(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public Car next() {
        return this.cars[this.index++];
    }

    @Override
    public boolean hasNext() {
        return this.index < this.cars.length && this.cars[this.index] != null;
    }
}

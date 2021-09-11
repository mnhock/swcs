package swcs.gof.behavioral.iterator.extern.cars;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("Car 1");
        cars[1] = new Car("Car 2");
        cars[2] = new Car("Car 3");
        cars[3] = new Car("Car 4");

        Iterator<Car> iterator = new CarIterator(cars);

        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.name());
        }
    }
}

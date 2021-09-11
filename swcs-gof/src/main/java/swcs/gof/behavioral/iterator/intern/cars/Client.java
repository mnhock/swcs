package swcs.gof.behavioral.iterator.intern.cars;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Car 1"), new Car("Car 2"), new Car("Car 3"), new Car("Car 4"));

        cars.forEach(c -> System.out.println(c.name()));
    }
}

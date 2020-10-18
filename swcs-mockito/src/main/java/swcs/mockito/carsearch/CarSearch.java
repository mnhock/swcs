package swcs.mockito.carsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarSearch {

    private final List<Car> cars;

    public CarSearch() {
        this.cars = new ArrayList<>();
    }

    public boolean addCar(Car car) {
        return this.cars.add(car);
    }

    public List<Car> findSportCars() {
        return this.cars.stream()
                .filter(Car::isSportCar)
                .collect(Collectors.toList());
    }
}

package swcs.mockito.carsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class CarSearchTest {

    @Test
    void shouldFindOnlySportCars() {
        CarSearch search = new CarSearch();

        Car car1 = mock(Car.class);
        Car car2 = mock(Car.class);
        Car car3 = mock(Car.class);

        when(car1.isSportCar()).thenReturn(false);
        when(car2.isSportCar()).thenReturn(true);
        when(car3.isSportCar()).thenReturn(false);

        search.addCar(car1);
        search.addCar(car2);
        search.addCar(car3);

        List<Car> sportCars = search.findSportCars();
        assertEquals(1, sportCars.size());
        assertEquals(car2, sportCars.get(0));
    }

}

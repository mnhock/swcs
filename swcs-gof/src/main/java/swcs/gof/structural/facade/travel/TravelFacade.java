package swcs.gof.structural.facade.travel;

import java.time.LocalDate;
import java.util.List;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public Travels availableTravels(LocalDate from, LocalDate to) {
        List<Flight> flights = this.flightBooker.flights(from, to);
        List<Hotel> hotels = this.hotelBooker.hotels(from, to);

        // process
        return null;
    }
}

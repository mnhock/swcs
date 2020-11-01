package swcs.gof.structural.facade.travel;

import java.time.LocalDate;
import java.util.List;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public Travels getAvailableTravels(LocalDate from, LocalDate to) {
        List<Flight> flights = this.flightBooker.getFlights(from, to);
        List<Hotel> hotels = this.hotelBooker.getHotels(from, to);

        //process
        return null;
    }
}

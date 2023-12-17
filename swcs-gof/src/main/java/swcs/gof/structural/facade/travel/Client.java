package swcs.gof.structural.facade.travel;

import java.time.LocalDate;

class Client {

    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.availableTravels(LocalDate.now(), LocalDate.now().plusMonths(2));
    }
}

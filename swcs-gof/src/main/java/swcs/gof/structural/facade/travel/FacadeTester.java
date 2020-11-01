package swcs.gof.structural.facade.travel;

import java.time.LocalDate;

public class FacadeTester {

    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.getAvailableTravels(LocalDate.now(), LocalDate.now().plusMonths(2));
    }
}

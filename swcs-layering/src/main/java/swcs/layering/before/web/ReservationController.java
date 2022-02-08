package swcs.layering.before.web;

import swcs.layering.before.service.ReservationService;

public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}

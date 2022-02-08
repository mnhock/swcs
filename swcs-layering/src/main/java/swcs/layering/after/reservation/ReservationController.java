package swcs.layering.after.reservation;

import swcs.layering.before.service.ReservationService;

class ReservationController {

    private final ReservationService reservationService;

    ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}

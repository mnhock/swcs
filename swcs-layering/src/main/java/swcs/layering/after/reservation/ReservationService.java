package swcs.layering.after.reservation;

import swcs.layering.before.repository.ReservationRepository;

class ReservationService {

    private final ReservationRepository reservationRepository;

    ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}

package swcs.layering.before.service;

import swcs.layering.before.repository.ReservationRepository;

public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}

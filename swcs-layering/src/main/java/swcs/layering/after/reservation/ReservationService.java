package swcs.layering.after.reservation;

class ReservationService {

    private final ReservationRepository reservationRepository;

    ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}

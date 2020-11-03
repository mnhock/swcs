package swcs.rental.after;

import java.util.Objects;

final class Rental {

    private static final int MIN_RENT_DAYS = 1;
    private static final int MAX_RENT_DAYS = 14;

    private final Movie movie;
    private final int days;

    Rental(Movie movie, int days) {
        this.movie = Objects.requireNonNull(movie);
        this.days = checkRentDays(days);
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getDays() {
        return this.days;
    }

    public double getCharge() {
        return this.movie.getCharge() * this.days;
    }

    private int checkRentDays(int days) {
        if (days < MIN_RENT_DAYS || days > MAX_RENT_DAYS) {
            throw new IllegalArgumentException(
                    String.format("Rent days %d not between %d and %d!", days, MIN_RENT_DAYS, MAX_RENT_DAYS));
        }

        return days;
    }

}

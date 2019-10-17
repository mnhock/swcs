package swcs.rental.after;

import java.util.Objects;

final class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = Objects.requireNonNull(movie);
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public double getCharge() {
        return this.movie.getCharge() * this.daysRented;
    }

}

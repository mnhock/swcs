package swcs.rental.before;

final class Rental {

    private final Movie movie;
    private final int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie movie() {
        return this.movie;
    }

    public int daysRented() {
        return this.daysRented;
    }

}

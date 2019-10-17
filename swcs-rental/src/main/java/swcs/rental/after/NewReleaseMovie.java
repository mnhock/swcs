package swcs.rental.after;

class NewReleaseMovie extends AbstractMovie implements Movie {

    private static final double CHARGE = 3;

    NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge() {
        return CHARGE;
    }

}

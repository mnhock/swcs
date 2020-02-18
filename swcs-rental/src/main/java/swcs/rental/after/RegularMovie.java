package swcs.rental.after;

class RegularMovie extends AbstractMovie implements Movie {

    private static final double CHARGE = 2;

    RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge() {
        return CHARGE;
    }

}

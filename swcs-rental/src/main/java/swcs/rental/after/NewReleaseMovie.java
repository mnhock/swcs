package swcs.rental.after;

class NewReleaseMovie extends AbstractMovie {

    private static final double CHARGE = 3;

    NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double charge() {
        return CHARGE;
    }

}

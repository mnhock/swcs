package swcs.rental.after;

class RegularMovie extends AbstractMovie {

    private static final double CHARGE = 2;

    RegularMovie(String title) {
        super(title);
    }

    @Override
    public double charge() {
        return CHARGE;
    }

}

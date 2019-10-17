package swcs.rental.after;

class ChildrenMovie extends AbstractMovie implements Movie {

    private static final double CHARGE = 1.5;

    ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge() {
        return CHARGE;
    }
}

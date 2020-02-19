package swcs.rental.after;

class ChildrenMovie extends AbstractMovie {

    private static final double CHARGE = 1;

    ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge() {
        return CHARGE;
    }
}

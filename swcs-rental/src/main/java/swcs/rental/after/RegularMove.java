package swcs.rental.after;

class RegularMove extends AbstractMovie implements Movie {

    private static final double CHARGE = 3.5;

    RegularMove(String title) {
        super(title);
    }

    @Override
    public double getCharge() {
        return CHARGE;
    }

}

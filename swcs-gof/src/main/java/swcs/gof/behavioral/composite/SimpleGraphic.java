package swcs.gof.behavioral.composite;

public class SimpleGraphic implements Graphic {

    @Override
    public void paint() {
        // run the paint operation
    }

    /**
     * Because we have no children, these operations will do nothing
     **/
    @Override
    public void add(Graphic g) {
        // unsupported operation
    }

    @Override
    public void remove(Graphic g) {
        // unsupported operation
    }

    @Override
    public Graphic get(int index) {
        // unsupported operation
        return null;
    }
}

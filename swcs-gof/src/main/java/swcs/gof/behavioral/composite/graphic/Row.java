package swcs.gof.behavioral.composite.graphic;

public class Row extends Composite {

    @Override
    public void paint() {
        System.out.printf(" %s%n", Row.class.getSimpleName());
        super.paint();
    }
}

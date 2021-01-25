package swcs.gof.behavioral.composite.graphic;

public class Row extends Composite {

    @Override
    public void paint() {
        System.out.println(String.format(" %s", Row.class.getSimpleName()));
        super.paint();
    }
}

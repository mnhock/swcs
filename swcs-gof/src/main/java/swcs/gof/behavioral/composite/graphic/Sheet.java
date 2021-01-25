package swcs.gof.behavioral.composite.graphic;

public class Sheet extends Composite {

    @Override
    public void paint() {
        System.out.println(Sheet.class.getSimpleName());
        super.paint();
    }
}

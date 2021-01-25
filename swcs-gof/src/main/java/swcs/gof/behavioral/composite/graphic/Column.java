package swcs.gof.behavioral.composite.graphic;

public class Column extends Composite {

    @Override
    public void paint() {
        System.out.println(String.format("  %s", Column.class.getSimpleName()));
        super.paint();
    }
}

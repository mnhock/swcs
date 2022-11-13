package swcs.gof.structural.composite.graphic;

public class Column extends Composite {

    @Override
    public void paint() {
        System.out.printf("  %s%n", Column.class.getSimpleName());
        super.paint();
    }
}

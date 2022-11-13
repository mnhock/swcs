package swcs.gof.structural.composite.organizationchart;

public class VP extends DisciplinaryLeadership {

    @Override
    public void draw() {
        System.out.printf(" %s%n", VP.class.getSimpleName());
        super.draw();
    }
}

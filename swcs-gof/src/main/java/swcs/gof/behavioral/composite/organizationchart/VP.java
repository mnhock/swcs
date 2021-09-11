package swcs.gof.behavioral.composite.organizationchart;

public class VP extends DisciplinaryLeadership {

    @Override
    public void draw() {
        System.out.printf(" %s%n", VP.class.getSimpleName());
        super.draw();
    }
}

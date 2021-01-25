package swcs.gof.behavioral.composite.organizationchart;

public class CTO extends DisciplinaryLeadership {

    @Override
    public void draw() {
        System.out.println(CTO.class.getSimpleName());
        super.draw();
    }
}

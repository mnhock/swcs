package swcs.gof.behavioral.composite.organizationchart;

public class VP extends DisciplinaryLeadership {

    @Override
    public void draw() {
        System.out.println(String.format(" %s", VP.class.getSimpleName()));
        super.draw();
    }
}

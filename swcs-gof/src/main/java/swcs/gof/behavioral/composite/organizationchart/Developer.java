package swcs.gof.behavioral.composite.organizationchart;

public class Developer implements Employee {

    @Override
    public void draw() {
        System.out.printf("  %s%n", Developer.class.getSimpleName());
    }
}

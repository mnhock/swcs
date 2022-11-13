package swcs.gof.structural.composite.organizationchart;

public class Developer implements Employee {

    @Override
    public void draw() {
        System.out.printf("  %s%n", Developer.class.getSimpleName());
    }
}

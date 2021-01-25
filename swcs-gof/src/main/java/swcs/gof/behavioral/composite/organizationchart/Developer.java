package swcs.gof.behavioral.composite.organizationchart;

public class Developer implements Employee {

    @Override
    public void draw() {
        System.out.println(String.format("  %s", Developer.class.getSimpleName()));
    }
}

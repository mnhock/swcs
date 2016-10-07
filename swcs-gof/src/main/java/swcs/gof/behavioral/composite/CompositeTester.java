package swcs.gof.behavioral.composite;

public class CompositeTester {

    // can just call paint, without worrying if this is a composite or leaf
    public void paint(Graphic g) {
        g.paint();
    }
}

package swcs.gof.behavioral.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private final List<Graphic> children = new ArrayList<>();

    @Override
    public void paint() {
        // run the paint operation for each child
        for (Graphic g : this.children) {
            g.paint();
        }
    }

    @Override
    public void add(Graphic g) {
        this.children.add(g);
    }

    @Override
    public void remove(Graphic g) {
        if (this.children.contains(g)) {
            this.children.remove(g);
        }
    }

    @Override
    public Graphic get(int index) {
        return this.children.get(index);
    }
}
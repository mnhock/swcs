package swcs.gof.behavioral.composite.graphic;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Component {

    private final List<Component> components = new ArrayList<>();

    @Override
    public void paint() {
        for (Component component : this.components) {
            component.paint();
        }
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        if (this.components.contains(component)) {
            this.components.remove(component);
        }
    }

    public Component get(int index) {
        return this.components.get(index);
    }
}

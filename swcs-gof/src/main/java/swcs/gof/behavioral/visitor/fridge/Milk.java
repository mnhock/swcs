package swcs.gof.behavioral.visitor.fridge;

import java.util.Date;

public class Milk implements FridgeElement {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    Date bestBeforeDate() {
        return new Date(2021 - 1900, 0, 1);
    }
}

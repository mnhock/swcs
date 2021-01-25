package swcs.gof.behavioral.visitor.fridge;

import java.time.LocalDate;

public class Beer implements FridgeElement {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    LocalDate getBestBeforeDate() {
        return LocalDate.of(2022, 1, 28);
    }
}

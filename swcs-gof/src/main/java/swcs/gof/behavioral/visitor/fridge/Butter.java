package swcs.gof.behavioral.visitor.fridge;

import java.time.LocalDate;

public class Butter implements FridgeElement {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    LocalDate getExpiryDate() {
        return LocalDate.of(2021, 10, 2);
    }
}

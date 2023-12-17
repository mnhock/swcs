package swcs.gof.behavioral.visitor.fridge;

import java.time.LocalDate;
import java.util.List;

class Client {

    public static void main(String[] args) {
        List<FridgeElement> fridge = List.of(
                new Beer(),
                new Beer(),
                new Milk(),
                new Butter());

        Visitor visitor = new BestBeforeDateVisitor(LocalDate.of(2021, 1, 1));

        System.out.println("Over the best before date:");

        for (FridgeElement element : fridge) {
            element.accept(visitor);
        }
    }
}

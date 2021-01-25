package swcs.gof.behavioral.visitor.fridge;

public interface FridgeElement {

    void accept(Visitor visitor);

}

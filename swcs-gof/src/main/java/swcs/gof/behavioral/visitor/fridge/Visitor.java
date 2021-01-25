package swcs.gof.behavioral.visitor.fridge;

public interface Visitor {

    void visit(Beer beer);

    void visit(Milk milk);

    void visit(Butter butter);

}

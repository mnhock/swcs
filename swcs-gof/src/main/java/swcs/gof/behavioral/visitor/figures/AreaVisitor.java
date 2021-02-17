package swcs.gof.behavioral.visitor.figures;

public class AreaVisitor implements Visitor<Double> {

    @Override
    public Double visit(Square square) {
        return square.side() * square.side();
    }

    @Override
    public Double visit(Circle circle) {
        return Math.PI * circle.radius() * circle.radius();
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return rectangle.height() * rectangle.weight();
    }
}

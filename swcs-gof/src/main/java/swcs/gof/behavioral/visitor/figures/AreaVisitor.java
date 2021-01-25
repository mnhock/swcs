package swcs.gof.behavioral.visitor.figures;

public class AreaVisitor implements Visitor<Double> {

    @Override
    public Double visit(Square square) {
        return square.getSide() * square.getSide();
    }

    @Override
    public Double visit(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWeight();
    }
}

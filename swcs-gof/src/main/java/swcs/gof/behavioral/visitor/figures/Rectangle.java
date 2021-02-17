package swcs.gof.behavioral.visitor.figures;

public class Rectangle implements Figure {

    private final double weight;
    private final double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double weight() {
        return this.weight;
    }

    public double height() {
        return this.height;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}

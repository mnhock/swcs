package swcs.dp.lsp.figure.after;

public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
}

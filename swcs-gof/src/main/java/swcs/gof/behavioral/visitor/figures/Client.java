package swcs.gof.behavioral.visitor.figures;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Figure> figures = List.of(
                new Circle(3),
                new Square(4),
                new Rectangle(2, 8));

        calculateArea(figures);
        calculatePerimeter(figures);
    }

    private static void calculateArea(List<Figure> figures) {
        Visitor<Double> visitor = new AreaVisitor();

        double totalArea = figures.stream()
                .mapToDouble(f -> f.accept(visitor))
                .sum();

        System.out.println(String.format("Total area: %f ", totalArea));
    }

    private static void calculatePerimeter(List<Figure> figures) {
        Visitor<Double> visitor = new PerimeterVisitor();

        double totalPerimeter = figures.stream()
                .mapToDouble(f -> f.accept(visitor))
                .sum();

        System.out.println(String.format("Total perimeter: %f", totalPerimeter));
    }
}

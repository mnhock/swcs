package swcs.dp.lsp.figure.after;

public class Tester {

    public static void main(String[] args) {
        testArea(new Rectangle(4, 5));
        testArea(new Square(5));
    }

    public static void testArea(Rectangle rectangle) {
        if (rectangle.getArea() != 20) {
            throw new IllegalStateException("Error in area calculation!");
        }
    }

}

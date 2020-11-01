package swcs.dp.lsp.figure.before;

public class Tester {

    public static void main(String[] args) {
        testArea(new Rectangle());
        testArea(new Square());
    }

    public static void testArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        if (rectangle.getArea() != 20) {
            throw new IllegalStateException("Error in area calculation!");
        }
    }

}

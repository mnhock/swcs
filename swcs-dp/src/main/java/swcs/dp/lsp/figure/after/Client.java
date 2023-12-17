package swcs.dp.lsp.figure.after;

class Client {

    public static void main(String[] args) {
        testArea(new Rectangle(4, 5));
        testArea(new Square(5));
    }

    public static void testArea(Rectangle rectangle) {
        if (rectangle.area() != 20) {
            throw new IllegalStateException("Error in area calculation!");
        }
    }

}

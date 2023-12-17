package swcs.dp.lsp.figure.before;

class Client {

    public static void main(String[] args) {
        testArea(new Rectangle());
        testArea(new Square());
    }

    public static void testArea(Rectangle rectangle) {
        rectangle.width(5);
        rectangle.height(4);

        if (rectangle.area() != 20) {
            throw new IllegalStateException("Error in area calculation!");
        }
    }

}

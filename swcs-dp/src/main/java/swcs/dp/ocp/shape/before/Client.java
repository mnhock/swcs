package swcs.dp.ocp.shape.before;

public class Client {

    public void draw(Shape[] shapes) {
        for (Shape shape : shapes) {
            switch (shape.getType()) {
            case Shape.SQUARE:
                draw((Square) shape);
                break;
            case Shape.CIRCLE:
                draw((Circle) shape);
                break;
            }
        }
    }

    private void draw(Circle circle) {
        // logic for circle
    }

    private void draw(Square square) {
        // logic for square
    }
}

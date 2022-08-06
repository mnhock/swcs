package swcs.dp.ocp.shape.before;

public class Client {

    public void draw(Shape[] shapes) {
        for (Shape shape : shapes) {
            switch (shape.type()) {
            case Shape.SQUARE -> draw((Square) shape);
            case Shape.CIRCLE -> draw((Circle) shape);
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

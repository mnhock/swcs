package swcs.dp.ocp.shape.after;

public class Client {
    public void draw(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
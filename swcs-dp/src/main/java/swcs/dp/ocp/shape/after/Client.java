package swcs.dp.ocp.shape.after;

class Client {
    public void draw(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
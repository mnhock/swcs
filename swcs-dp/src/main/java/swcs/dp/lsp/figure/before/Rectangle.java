package swcs.dp.lsp.figure.before;

public class Rectangle {

    private double height;
    private double width;

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }
}

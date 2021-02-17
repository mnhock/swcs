package swcs.dp.lsp.figure.before;

public class Rectangle {

    private double height;
    private double width;

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public void height(double height) {
        this.height = height;
    }

    public void width(double width) {
        this.width = width;
    }

    public double area() {
        return this.width * this.height;
    }
}

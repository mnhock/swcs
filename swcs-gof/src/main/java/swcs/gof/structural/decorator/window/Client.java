package swcs.gof.structural.decorator.window;

public class Client {

    public static void main(String[] args) {
        Window window = new SimpleWindow();
        window.renderWindow();

        // at some point later maybe text size becomes larger than the window thus the scrolling behavior must be added
        window = new ScrollableWindow(window); // decorate old window, now window object has additional behavior / state

        window.renderWindow();
    }
}

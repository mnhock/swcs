package swcs.gof.structural.decorator;

public class DecoratedWindow implements Window {

    private Window window;

    public DecoratedWindow(Window window) {
        this.window = window;
    }

    @Override
    public void renderWindow() {
        this.window.renderWindow();
    }
}
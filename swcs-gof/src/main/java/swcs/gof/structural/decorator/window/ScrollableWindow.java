package swcs.gof.structural.decorator.window;

public class ScrollableWindow extends DecoratedWindow {
    private Object scrollBar;

    public ScrollableWindow(Window window) {
        super(window);
    }

    @Override
    public void renderWindow() {
        super.renderWindow();
        renderScrollBar();
    }

    private void renderScrollBar() {
        this.scrollBar = new Object(); // prepare scrollbar
        // render scrollbar
    }
}

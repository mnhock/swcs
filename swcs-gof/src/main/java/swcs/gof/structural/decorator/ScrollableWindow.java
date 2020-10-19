package swcs.gof.structural.decorator;

public class ScrollableWindow extends DecoratedWindow {

    private Object scrollBar;

    public ScrollableWindow(Window windowRefernce) {
        super(windowRefernce);
    }

    @Override
    public void renderWindow() {
        renderScrollBar();
        super.renderWindow();
    }

    private void renderScrollBar() {
        // prepare scroll bar
        this.scrollBar = new Object();

        // render scrollbar
    }
}
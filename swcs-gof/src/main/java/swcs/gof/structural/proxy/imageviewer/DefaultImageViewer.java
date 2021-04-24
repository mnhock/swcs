package swcs.gof.structural.proxy.imageviewer;

public final class DefaultImageViewer implements ImageViewer {

    private final Image image;

    public DefaultImageViewer(String path) {
        // Slow operation
        this.image = Image.load(path);
    }

    @Override
    public void display() {
        // Slow operation
        this.image.display();
    }
}
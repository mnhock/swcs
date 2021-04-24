package swcs.gof.structural.proxy.imageviewer;

public final class ImageViewerProxy implements ImageViewer {

    private final String path;
    private ImageViewer viewer;

    public ImageViewerProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (this.viewer == null) {
            this.viewer = new DefaultImageViewer(this.path);
        }

        this.viewer.display();
    }
}
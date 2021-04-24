package swcs.gof.structural.proxy.imageviewer;

public interface Image {

    void display();

    static Image load(String path) {
        // Not implemented
        return null;
    }
}

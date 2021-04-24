package swcs.gof.structural.proxy.imageviewer;

public class Client {

    public static void main(String[] args) {
        ImageViewer beer = new ImageViewerProxy("./img/beer.png");
        ImageViewer hammock = new ImageViewerProxy("./img/hammock.png");

        beer.display();
        beer.display(); // DefaultImageViewer will be call and be executed once

        hammock.display();
    }
}

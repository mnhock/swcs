package swcs.converter.before;

import java.io.File;

class Client {

    public static void main(String[] args) {
        File file = Converter.convert("jpg", new File("picture.tiff"));
        // ...
    }
}

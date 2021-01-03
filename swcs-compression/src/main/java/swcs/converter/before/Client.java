package swcs.converter.before;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        File file = Converter.convert("jpg", new File("picture.tiff"));
        // ...
    }
}

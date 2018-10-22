package swcs.converter.after;

import java.io.File;

public class ConverterTester {

    public static void main(String[] args) {
        Converter converter = new Converter(new File("picture.tiff"));
        File converted = converter.convert("jpg");
        // ...
    }
}

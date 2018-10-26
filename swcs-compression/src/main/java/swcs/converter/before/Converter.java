package swcs.converter.before;

import java.io.File;

public class Converter {

    public static File convert(String format, File file) {
        System.out.println("Compression: convert started.");

        // Check if source format supported

        File compressedFile = null;

        if (format.equals("png")) {
            System.out.println("Compression: png compression");
            // do compression on file;
            // compressedFile =
        } else if (format.equals("jpg")) {
            System.out.println("Compression: jpg compression");
            // do compression on file;
            // compressedFile =
        }

        System.out.println("Compression: convert completed.");

        return compressedFile;
    }
}
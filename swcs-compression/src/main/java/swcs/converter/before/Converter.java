package swcs.converter.before;

import java.io.File;

public class Converter {

    public static File convert(String format, File file) {
        System.out.println("CompressionFacade: convert started.");

        // Check if source format supported

        File file2 = null;

        if (format.equals("png")) {
            System.out.println("CompressionFactory: png compression");
            // do compression on file;
            // compressedFile =
        } else if (format.equals("jpg")) {
            System.out.println("CompressionFactory: jpg compression");
            // do compression on file;
            // compressedFile =
        }

        System.out.println("CompressionFacade: convert completed.");

        return file2;
    }
}
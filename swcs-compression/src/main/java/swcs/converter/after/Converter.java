package swcs.converter.after;

import java.io.File;
import java.util.Objects;

public class Converter { //Facade

    private final File source;

    public Converter(File source) {
        Objects.requireNonNull(source);

        this.source = source;
    }

    public File convert(CompressionType type) {
        Objects.requireNonNull(type);

        System.out.println("Compression: convert started.");

        isSourceFormatSupported();

        Compression compression = CompressionFactory.newInstance(type);
        File converted = compression.compress(this.source);

        System.out.println("Compression: convert completed.");

        return converted;
    }

    private void isSourceFormatSupported() {
        // Check if source format supported
    }
}
package swcs.converter.after;

import java.io.File;
import java.util.Objects;

public class Converter {

    private final File source;

    public Converter(File source) {
        this.source = Objects.requireNonNull(source);
    }

    public File convert(CompressionType type) {
        Objects.requireNonNull(type);

        System.out.println("Compression: convert started.");

        Compression compression = CompressionFactory.from(type);
        File converted = compression.compress(this.source);

        System.out.println("Compression: convert completed.");

        return converted;
    }

}
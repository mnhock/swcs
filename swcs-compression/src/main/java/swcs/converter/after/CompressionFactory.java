package swcs.converter.after;

import java.util.EnumMap;
import java.util.Map;

final class CompressionFactory {

    private static final Map<CompressionType, Compression> CONVERTERS;

    static {
        CONVERTERS = new EnumMap<>(CompressionType.class);
        CONVERTERS.put(CompressionType.JPG, new JpgCompression());
        CONVERTERS.put(CompressionType.PNG, new PngCompression());
    }

    private CompressionFactory() {
    }

    static Compression newInstance(CompressionType type) {
        Compression compression = CONVERTERS.get(type);

        if (compression == null) {
            throw new IllegalArgumentException(String.format("'%s' target format not supported!", type));
        }

        System.out.println(String.format("CompressionFactory: '%s' compression", type));

        return compression;
    }
}

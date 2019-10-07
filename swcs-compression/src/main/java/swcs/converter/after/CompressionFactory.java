package swcs.converter.after;

final class CompressionFactory {

    private CompressionFactory() {
    }

    static Compression newInstance(String targetFormat) {
        Compression compression = null;

        if ("png".equals(targetFormat)) {
            compression = new PngCompression();
        } else if ("jpg".equals(targetFormat)) {
            compression = new JpgCompression();
        } else {
            throw new IllegalArgumentException(String.format("'%s' target format not supported!", targetFormat));
        }

        System.out.println(String.format("CompressionFactory: '%s' compression", targetFormat));

        return compression;
    }
}

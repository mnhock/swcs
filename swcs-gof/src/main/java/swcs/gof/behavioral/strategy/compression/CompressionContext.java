package swcs.gof.behavioral.strategy.compression;

import java.io.File;
import java.util.List;

public class CompressionContext {
    private CompressionStrategy strategy;

    // this can be set at runtime by the application preferences
    public void compressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    // use the strategy
    public void createArchive(List<File> files) {
        this.strategy.compressFiles(files);
    }
}
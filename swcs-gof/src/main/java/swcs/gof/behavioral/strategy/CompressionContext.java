package swcs.gof.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
    private CompressionStrategy strategy;

    // this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    // use the strategy
    public void createArchive(ArrayList<File> files) {
        this.strategy.compressFiles(files);
    }
}
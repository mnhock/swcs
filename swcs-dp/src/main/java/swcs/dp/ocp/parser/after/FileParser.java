package swcs.dp.ocp.parser.after;

abstract class FileParser {

    private final String filePath;

    public FileParser(String filePath) {
        this.filePath = filePath;
    }

    public abstract String parse();
}

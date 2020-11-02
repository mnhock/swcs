package swcs.dp.ocp.parser.before;

public class FileParser {

    private final String filePath;

    public FileParser(String filePath) {
        this.filePath = filePath;
    }

    public String parse() {
        if (this.filePath.indexOf(".xml") > 1) {
            return parseXML(this.filePath);
        } else if (this.filePath.indexOf(".txt") > 1) {
            return parseText(this.filePath);
        }

        return null;
    }

    private String parseXML(String filePath) {
        // logic
        return null;
    }

    private String parseText(String filePath) {
        // logic
        return null;
    }
}

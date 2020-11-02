package swcs.dp.ocp.parser.before;

public class FileParser {

    public String parse(String filePath) {
        if (filePath.indexOf(".xml") > 1) {
            return parseXML(filePath);
        } else if (filePath.indexOf(".json") > 1) {
            return parseJson(filePath);
        }

        return null;
    }

    private String parseXML(String filePath) {
        // logic
        return null;
    }

    private String parseJson(String filePath) {
        // logic
        return null;
    }
}

package swcs.dp.ocp.parser.after;

public class XmlParser implements FileParser {

    @Override
    public String parse(String file) {
        return String.format("Parser %s", XmlParser.class.getSimpleName());
    }

    @Override
    public boolean supports(String extension) {
        return "xml".equalsIgnoreCase(extension);
    }

}
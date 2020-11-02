package swcs.dp.ocp.parser.after;

public class JsonParser implements FileParser {

    @Override
    public String parse(String file) {
        return String.format("Parser %s", JsonParser.class.getSimpleName());
    }

    @Override
    public boolean supports(String extension) {
        return "json".equalsIgnoreCase(extension);
    }

}
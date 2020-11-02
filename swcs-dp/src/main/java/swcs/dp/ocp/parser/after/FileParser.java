package swcs.dp.ocp.parser.after;

public interface FileParser {

    String parse(String file);

    boolean supports(String extension);

}

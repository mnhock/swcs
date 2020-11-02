package swcs.dp.ocp.parser.after;

import java.util.ServiceLoader;

public final class FileParserFactory {

    private FileParserFactory() {
    }

    public static FileParser newInstance(String extension) {
        ServiceLoader<FileParser> loader = ServiceLoader.load(FileParser.class);

        for (FileParser parser : loader) {
            if (parser.supports(extension)) {
                return parser;
            }
        }

        return null;
    }

}

package swcs.args.after;

public class StringArgumentMarshaler implements ArgumentMarshaler {

    public static final String TOKEN = "*";

    private String value = "";

    @Override
    public void set(String argument) {
        this.value = argument;
    }

    public static String getValue(ArgumentMarshaler am) {
        if ((am instanceof StringArgumentMarshaler)) {
            return ((StringArgumentMarshaler) am).value;
        } else {
            return "";
        }
    }
}
package swcs.args.after;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {

    public static final String TOKEN = "#";

    private int value = 0;

    @Override
    public void set(String argument) {
        this.value = Integer.valueOf(argument);

    }

    public static int getValue(ArgumentMarshaler am) {
        if ((am != null) && (am instanceof IntegerArgumentMarshaler)) {
            return ((IntegerArgumentMarshaler) am).value;
        } else {
            return 0;
        }
    }
}
package swcs.args.after;

import static swcs.args.after.ArgsException.ErrorCode.MISSING_STRING;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            this.stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if ((am != null) && (am instanceof StringArgumentMarshaler)) {
            return ((StringArgumentMarshaler) am).stringValue;
        } else {
            return "";
        }
    }
}
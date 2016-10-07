package swcs.args.after;

import static swcs.args.after.ArgsException.ErrorCode.INVALID_INTEGER;
import static swcs.args.after.ArgsException.ErrorCode.MISSING_INTEGER;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int intValue = 0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            this.intValue = Integer.parseInt(parameter);
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_INTEGER);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_INTEGER, parameter);
        }
    }

    public static int getValue(ArgumentMarshaler am) {
        if ((am != null) && (am instanceof IntegerArgumentMarshaler)) {
            return ((IntegerArgumentMarshaler) am).intValue;
        } else {
            return 0;
        }
    }
}
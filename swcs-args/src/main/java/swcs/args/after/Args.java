package swcs.args.after;

import static swcs.args.after.ArgsException.ErrorCode.INVALID_ARGUMENT_FORMAT;
import static swcs.args.after.ArgsException.ErrorCode.INVALID_ARGUMENT_NAME;
import static swcs.args.after.ArgsException.ErrorCode.UNEXPECTED_ARGUMENT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Args {

    private final Map<Character, ArgumentMarshaler> marshalers;
    private final Set<Character> foundArgs;
    private ListIterator<String> currentArgument;

    public Args(String schema, String[] args) throws ArgsException {
        this.marshalers = new HashMap<Character, ArgumentMarshaler>();
        this.foundArgs = new HashSet<Character>();

        parseSchema(schema);
        parseArgumentStrings(Arrays.asList(args));
    }

    private void parseSchema(String schema) throws ArgsException {
        for (String element : schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element.trim());
            }
        }
    }

    private void parseSchemaElement(String element) throws ArgsException {
        char elementId = element.charAt(0);
        String elementTail = element.substring(1);

        validateSchemaElementId(elementId);

        if (elementTail.equals("*")) {
            this.marshalers.put(elementId, new StringArgumentMarshaler());
        } else if (elementTail.equals("#")) {
            this.marshalers.put(elementId, new IntegerArgumentMarshaler());
        } else {
            throw new ArgsException(INVALID_ARGUMENT_FORMAT, elementId, elementTail);
        }
    }

    private void validateSchemaElementId(char elementId) throws ArgsException {
        if (!Character.isLetter(elementId)) {
            throw new ArgsException(INVALID_ARGUMENT_NAME, elementId, null);
        }
    }

    private void parseArgumentStrings(List<String> argsList) throws ArgsException {
        if (argsList != null && argsList.size() > 0) {
            this.currentArgument = argsList.listIterator();
            String argString = this.currentArgument.next();

            if (argString.startsWith("-")) {
                parseArgumentCharacters(argString.substring(1));
            } else {
                throw new ArgsException(INVALID_ARGUMENT_FORMAT, '-', "");
            }
        }
    }

    private void parseArgumentCharacters(String argChars) throws ArgsException {
        for (int i = 0; i < argChars.length(); i++) {
            parseArgumentCharacter(argChars.charAt(i));
        }
    }

    private void parseArgumentCharacter(char argChar) throws ArgsException {
        ArgumentMarshaler marshaler = this.marshalers.get(argChar);

        if (marshaler != null) {
            this.foundArgs.add(argChar);

            try {
                marshaler.set(this.currentArgument);
            } catch (ArgsException e) {
                e.setErrorArgumentId(argChar);
                throw e;
            }
        } else {
            throw new ArgsException(UNEXPECTED_ARGUMENT, argChar, null);
        }
    }

    public boolean has(char arg) {
        return this.foundArgs.contains(arg);
    }

    public String getString(char arg) {
        return StringArgumentMarshaler.getValue(this.marshalers.get(arg));
    }

    public int getInt(char arg) {
        return IntegerArgumentMarshaler.getValue(this.marshalers.get(arg));
    }
}
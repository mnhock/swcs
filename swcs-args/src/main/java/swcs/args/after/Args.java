package swcs.args.after;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Args {

    private final Map<Character, ArgumentMarshaler> marshalers;
    private ListIterator<String> currentArgument;

    public Args(String schema, String[] args) {
        this.marshalers = new HashMap<Character, ArgumentMarshaler>();

        validateParameter(schema, args);

        parseSchema(schema);
        parseArguments(Arrays.asList(args));
    }

    private void validateParameter(String schema, String[] args) {
        if (!(schema != null && schema.length() > 0 && args != null && args.length > 0)) {
            throw new RuntimeException("Invalid parameters!");
        }
    }

    private void parseSchema(String schema) {
        for (String element : schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element.trim());
            }
        }
    }

    private void parseSchemaElement(String element) {
        char elementId = element.charAt(0);
        String elementToken = element.substring(1);

        validateSchemaElementId(elementId);

        if (StringArgumentMarshaler.TOKEN.equals(elementToken)) {
            this.marshalers.put(elementId, new StringArgumentMarshaler());
        } else if (IntegerArgumentMarshaler.TOKEN.equals(elementToken)) {
            this.marshalers.put(elementId, new IntegerArgumentMarshaler());
        } else {
            throw new RuntimeException(String.format("Argument: %c has invalid format: %s!", elementId, elementToken));
        }
    }

    private void validateSchemaElementId(char elementId) {
        if (!Character.isLetter(elementId)) {
            throw new RuntimeException(String.format("Argument: %c has invalid argument name!", elementId));
        }
    }

    private void parseArguments(List<String> args) {
        this.currentArgument = args.listIterator();

        while (this.currentArgument.hasNext()) {
            String argString = this.currentArgument.next();

            if (argString.startsWith("-") && argString.length() == 2) {
                parseArgumentCharacter(argString.charAt(1));
            } else {
                throw new RuntimeException("Invalid argument format!");
            }
        }
    }

    private void parseArgumentCharacter(char argChar) {
        ArgumentMarshaler marshaler = this.marshalers.get(argChar);

        if (marshaler != null) {
            marshaler.set(this.currentArgument.next());
        } else {
            throw new RuntimeException(String.format("Unexpected argument: %c found!", argChar));
        }
    }

    public String getString(char argChar) {
        return StringArgumentMarshaler.getValue(this.marshalers.get(argChar));
    }

    public int getInt(char argChar) {
        return IntegerArgumentMarshaler.getValue(this.marshalers.get(argChar));
    }
}
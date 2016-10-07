package swcs.args.before;

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Args {

    private String schema;
    private String[] args;

    private Map<Character, String> stringArgs = new HashMap<Character, String>();
    private Map<Character, Integer> intArgs = new HashMap<Character, Integer>();
    private Set<Character> argsFound = new HashSet<Character>();
    private int currentArgument;

    public Args(String schema, String[] args) throws ParseException {
        this.schema = schema;
        this.args = args;

        parse();
    }

    private void parse() throws ParseException {
        if ((this.schema.length() == 0) && (this.args.length == 0)) {
            return;
        }
        
        parseSchema();
        
        try {
            parseArguments();
        } catch (ArgsException e) {
        }
    }

    private boolean parseSchema() throws ParseException {
        for (String element : this.schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element.trim());
            }
        }
        return true;
    }

    private void parseSchemaElement(String element) throws ParseException {
        char elementId = element.charAt(0);
        String elementTail = element.substring(1);
        validateSchemaElementId(elementId);

        if (elementTail.equals("*")) {
            this.stringArgs.put(elementId, "");
        } else if (elementTail.equals("#")) {
            this.intArgs.put(elementId, 0);
        } else {
            throw new ParseException(String.format("Argument: %c has invalid format: %s.", elementId, elementTail), 0);
        }
    }

    private void validateSchemaElementId(char elementId) throws ParseException {
        if (!Character.isLetter(elementId)) {
            throw new ParseException("Bad character:" + elementId + "in Args format: " + this.schema, 0);
        }
    }

    private boolean parseArguments() throws ArgsException {
        for (this.currentArgument = 0; this.currentArgument < this.args.length; this.currentArgument++) {
            String arg = this.args[this.currentArgument];
            if (arg.startsWith("-")) {
                parseElements(arg);
            }
        }
        return true;
    }

    private void parseElements(String arg) throws ArgsException {
        for (int i = 1; i < arg.length(); i++) {
            parseElement(arg.charAt(i));
        }
    }

    private void parseElement(char argChar) throws ArgsException {
        if (setArgument(argChar)) {
            this.argsFound.add(argChar);
        }
    }

    private boolean setArgument(char argChar) throws ArgsException {
        if (this.stringArgs.containsKey(argChar)) {
            setStringArg(argChar);
        } else if (this.intArgs.containsKey(argChar)) {
            setIntArg(argChar);
        } else {
            return false;
        }

        return true;
    }

    private void setIntArg(char argChar) throws ArgsException {
        this.currentArgument++;
        String parameter = null;
        try {
            parameter = this.args[this.currentArgument];
            this.intArgs.put(argChar, new Integer(parameter));
        } catch (ArrayIndexOutOfBoundsException e) {

            throw new ArgsException();
        } catch (NumberFormatException e) {

            throw new ArgsException();
        }
    }

    private void setStringArg(char argChar) throws ArgsException {
        this.currentArgument++;
        try {
            this.stringArgs.put(argChar, this.args[this.currentArgument]);
        } catch (ArrayIndexOutOfBoundsException e) {

            throw new ArgsException();
        }
    }

    public String getString(char arg) {
        String s = this.stringArgs.get(arg);
        return s == null ? "" : s;
    }

    public int getInt(char arg) {
        Integer i = this.intArgs.get(arg);
        return i == null ? 0 : i;
    }

    public boolean has(char arg) {
        return this.argsFound.contains(arg);
    }

}
package swcs.args.before;

import java.util.HashMap;

public class Args {

    private final String schema;
    private final String[] args;

    private final HashMap<Character, String> stringArgsHashMap = new HashMap<>();
    private final HashMap<Character, Integer> intArgsHashMap = new HashMap<>();
    private int argument;

    public Args(String schema, String[] args) {
        this.schema = schema;
        this.args = args;

        if ((this.schema.length() > 0) && (this.args.length > 0)) {
            for (String element : this.schema.split(",")) {
                if (element.length() > 0) {
                    char elementId = element.trim().charAt(0);
                    String elementTail = element.trim().substring(1);

                    if (!Character.isLetter(elementId)) {
                        throw new RuntimeException("Bad character:" + elementId + "in Args format: " + this.schema);
                    }

                    if (elementTail.equals("*")) {
                        this.stringArgsHashMap.put(elementId, "");
                    } else if (elementTail.equals("#")) {
                        this.intArgsHashMap.put(elementId, 0);
                    } else {
                        throw new RuntimeException(String.format("Argument: %c has invalid format: %s.", elementId, elementTail));
                    }
                }
            }

            for (this.argument = 0; this.argument < this.args.length; this.argument++) {
                String arg = this.args[this.argument];
                if (arg.startsWith("-")) {
                    char argChar = arg.charAt(1);

                    if (this.stringArgsHashMap.containsKey(argChar)) {
                        setStringArg(argChar);
                    } else if (this.intArgsHashMap.containsKey(argChar)) {
                        setIntArg(argChar);
                    }
                }
            }
        }
    }

    private void setIntArg(char argChar) {
        this.argument++;

        this.intArgsHashMap.put(argChar, new Integer(this.args[this.argument]));
    }

    private void setStringArg(char argChar) {
        this.argument++;

        this.stringArgsHashMap.put(argChar, this.args[this.argument]);

    }

    public String getString(char arg) {
        String s = this.stringArgsHashMap.get(arg);
        return s == null ? "" : s;
    }

    public int getInt(char arg) {
        Integer i = this.intArgsHashMap.get(arg);
        return i == null ? 0 : i;
    }
}
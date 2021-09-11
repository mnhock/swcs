package swcs.gof.behavioral.interpreter.hexbinary;

public abstract class Expression {

    private final int value;

    public Expression(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    abstract String interpret(Context context);
}
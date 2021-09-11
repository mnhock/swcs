package swcs.gof.behavioral.interpreter.hexbinary;

public final class IntToHexExpression extends Expression {

    public IntToHexExpression(int value) {
        super(value);
    }

    @Override
    public String interpret(Context context) {
        return Integer.toHexString(value());
    }
}
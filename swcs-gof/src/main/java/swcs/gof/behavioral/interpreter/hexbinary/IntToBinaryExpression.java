package swcs.gof.behavioral.interpreter.hexbinary;

public final class IntToBinaryExpression extends Expression {

    public IntToBinaryExpression(int value) {
        super(value);
    }

    @Override
    public String interpret(Context context) {
        return Integer.toBinaryString(value());
    }
}
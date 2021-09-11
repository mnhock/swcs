package swcs.gof.behavioral.interpreter.hexbinary;

import java.util.Objects;

public final class Context {

    private final String expression;

    public Context(String expression) {
        this.expression = Objects.requireNonNull(expression);
    }

    public String expression() {
        return this.expression;
    }

    public boolean isToHex() {
        return this.expression.contains("Hexadecimal");
    }

    public boolean isToBinary() {
        return this.expression.contains("Binary");
    }

    public int number() {
        return Integer.parseInt(this.expression.substring(0, this.expression.indexOf(' ')));
    }
}
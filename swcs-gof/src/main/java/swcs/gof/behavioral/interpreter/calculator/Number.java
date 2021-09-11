package swcs.gof.behavioral.interpreter.calculator;

public final class Number implements Expression {

    private final int number;

    public Number(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
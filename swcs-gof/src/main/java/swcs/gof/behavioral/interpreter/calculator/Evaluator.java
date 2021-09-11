package swcs.gof.behavioral.interpreter.calculator;

import java.util.Objects;

public final class Evaluator {

    private final String expression;

    public Evaluator(String expression) {
        this.expression = Objects.requireNonNull(expression);
    }

    public String expression() {
        return this.expression;
    }

    public int evaluate() {
        Expression last = null;
        String[] splitted = this.expression.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            if ("+".equals(splitted[i])) {
                last = new Plus(last, new Number(splitted[i + 1]));
                i++;
            } else if ("-".equals(splitted[i])) {
                last = new Minus(last, new Number(splitted[i + 1]));
                i++;
            } else {
                last = new Number(splitted[i]);
            }
        }

        return last.interpret();
    }
}
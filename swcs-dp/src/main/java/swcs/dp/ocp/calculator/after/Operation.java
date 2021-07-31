package swcs.dp.ocp.calculator.after;

import java.util.function.DoubleBinaryOperator;

public enum Operation {

    PLUS((x, y) -> x + y),
    MINUS((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y);

    private final DoubleBinaryOperator operator;

    Operation(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    public double apply(double x, double y) {
        return this.operator.applyAsDouble(x, y);
    }
}

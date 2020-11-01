package swcs.dp.ocp.calculator.before;

public class Calculator {

    public double calculate(double x, double y, String operator) {
        double result;

        if ("plus".equals(operator)) {
            result = x + y;
        } else if ("minus".equals(operator)) {
            result = x - y;
        } else if ("multiply".equals(operator)) {
            result = x * y;
        } else if ("divide".equals(operator)) {
            result = x / y;
        } else {
            throw new IllegalArgumentException(String.format("Operator %s not supported!", operator));
        }

        return result;
    }
}

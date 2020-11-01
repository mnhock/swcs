package swcs.dp.ocp.calculator.after;

public class Calculator {

    public double calculate(double x, double y, Operation operation) {
        return operation.apply(x, y);
    }
}

package swcs.gof.behavioral.interpreter.hexbinary;

class Client {

    public static void main(String[] args) {
        print("42 in Binary");
        print("42 in Hexadecimal");
    }

    private static void print(String expression) {
        System.out.printf("%s = %s%n", expression, interpret(expression));
    }

    private static String interpret(String expression) {
        Context context = new Context(expression);
        Expression exp;

        if (context.isToHex()) {
            exp = new IntToHexExpression(context.number());
        } else if (context.isToBinary()) {
            exp = new IntToBinaryExpression(context.number());
        } else {
            return context.expression();
        }

        return exp.interpret(context);
    }
}
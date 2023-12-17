package swcs.gof.behavioral.interpreter.calculator;

class Client {

    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator("5 - 3 + 29 - 1");

        System.out.printf("%s = %s%n",
                evaluator.expression(),
                evaluator.evaluate());
    }
}

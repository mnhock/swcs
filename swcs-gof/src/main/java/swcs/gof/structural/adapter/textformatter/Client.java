package swcs.gof.structural.adapter.textformatter;

public class Client {

    public static void main(String[] args) {
        String text = "Adapter Pattern 1. Adapter Pattern 2. Adapter Pattern 3.";

        TextFormattable tf = new NewlineFormatter();
        System.out.println(tf.formatText(text, "."));

        tf = new CsvAdapter(new CsvFormatter());
        System.out.println(tf.formatText(text, "."));
    }
}

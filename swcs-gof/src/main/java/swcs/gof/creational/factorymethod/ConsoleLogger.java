package swcs.gof.creational.factorymethod;

public class ConsoleLogger implements Logger {

    private String prefix;

    @Override
    public void log(String message) {
        if (this.prefix != null) {
            System.out.println(this.prefix + " " + message);
        } else {
            System.out.println(message);
        }
    }

    @Override
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
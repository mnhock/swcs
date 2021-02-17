package swcs.gof.creational.factorymethod.logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

}
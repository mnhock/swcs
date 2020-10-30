package swcs.gof.creational.factorymethod;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
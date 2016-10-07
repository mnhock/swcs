package swcs.gof.creational.factorymethod;

public class ConsoleLoggerCreator extends AbstractLoggerCreator {

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
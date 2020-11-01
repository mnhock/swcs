package swcs.gof.creational.factorymethod.logger;

public class ConsoleLoggerCreator extends AbstractLoggerCreator {

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
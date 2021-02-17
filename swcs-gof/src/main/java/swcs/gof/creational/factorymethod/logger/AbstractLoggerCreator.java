package swcs.gof.creational.factorymethod.logger;

public abstract class AbstractLoggerCreator {

    public Logger logger() {
        // depending on the subclass, we'll get a particular logger.
        Logger logger = createLogger();

        // could do other operations on the logger here
        logger.log(String.format("Logger %s are used.", logger.name()));

        return logger;
    }

    public abstract Logger createLogger();
}

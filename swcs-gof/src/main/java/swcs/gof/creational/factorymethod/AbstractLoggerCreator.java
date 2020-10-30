package swcs.gof.creational.factorymethod;

public abstract class AbstractLoggerCreator {

    public Logger getLogger() {
        // depending on the subclass, we'll get a particular logger.
        Logger logger = createLogger();

        //could do other operations on the logger here
        logger.log(String.format("Logger %s are used.", logger.getName()));

        return logger;
    }

    public abstract Logger createLogger();
}

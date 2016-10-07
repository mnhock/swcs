package swcs.gof.creational.factorymethod;

public abstract class AbstractLoggerCreator {

    public Logger getLogger() {
        // depending on the subclass, we'll get a particular logger.
        Logger logger = createLogger();
        logger.setPrefix("prefix: ");
        //could do other operations on the logger here
        return logger;
    }

    public abstract Logger createLogger();
}

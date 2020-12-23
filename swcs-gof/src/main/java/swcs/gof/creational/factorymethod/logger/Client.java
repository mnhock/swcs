package swcs.gof.creational.factorymethod.logger;

public class Client {

    public static void main(String[] args) {
        AbstractLoggerCreator creator = new ConsoleLoggerCreator();
        Logger logger = creator.getLogger();
        logger.log("message");
    }
}
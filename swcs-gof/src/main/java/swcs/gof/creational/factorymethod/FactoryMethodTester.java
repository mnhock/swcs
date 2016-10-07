package swcs.gof.creational.factorymethod;

public class FactoryMethodTester {

    public static void main(String[] args) {
        AbstractLoggerCreator creator = new ConsoleLoggerCreator();
        Logger logger = creator.getLogger();
        logger.log("message");
    }
}
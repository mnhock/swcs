package swcs.dp.dip.logger.after;

class Tester {

    public static void main(String[] args) {
        Logger fsLogger = new Logger(new FileSystem());
        Logger dbLogger = new Logger(new Database());

        fsLogger.log("some text");
        dbLogger.log("other text");
    }
}

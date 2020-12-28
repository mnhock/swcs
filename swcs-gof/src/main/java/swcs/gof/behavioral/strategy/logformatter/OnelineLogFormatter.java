package swcs.gof.behavioral.strategy.logformatter;

public class OnelineLogFormatter implements LogFormatter {

    @Override
    public String format(Log log) {
        return String.format("%s %s", 
                log.getHash(), 
                log.getMessage());
    }
}
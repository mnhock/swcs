package swcs.gof.behavioral.strategy.logformatter;

public class ShortLogFormatter implements LogFormatter {

    @Override
    public String format(Log log) {
        return String.format("Hash: %s%nAuthor: %s%nMessage: %s%n", 
                log.getHash(), 
                log.getAuthor(), 
                log.getMessage());
    }
}
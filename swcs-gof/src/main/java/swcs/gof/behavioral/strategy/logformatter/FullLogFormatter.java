package swcs.gof.behavioral.strategy.logformatter;

public class FullLogFormatter implements LogFormatter {

    @Override
    public String format(Log log) {
        return String.format("Hash: %s%nAuthor: %s%nMessage: %s%nDate: %s%n", 
                log.getHash(), 
                log.getAuthor(), 
                log.getMessage(),
                log.getDate());
    }
}
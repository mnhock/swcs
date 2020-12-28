package swcs.gof.behavioral.strategy.logformatter;

import java.util.List;

public class GitConsole {

    private final LogFormatter formatter;

    public GitConsole(LogFormatter formatter) {
        this.formatter = formatter;
    }

    public void printLog(List<Log> logs) {
        logs.forEach(log -> System.out.println(this.formatter.format(log)));
    }
}
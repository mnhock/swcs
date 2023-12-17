package swcs.gof.behavioral.strategy.logformatter;

import java.time.LocalDateTime;
import java.util.List;

class Client {

    public static void main(String[] args) {
        GitConsole console = new GitConsole(new FullLogFormatter());

        List<Log> logs = List.of(
                new Log("397c670", "cleancoder", "Clean up", LocalDateTime.now()),
                new Log("07aa4d5", "cleancoder", "Fix NPE in Log", LocalDateTime.now()));

        console.printLog(logs);
    }
}
package swcs.gof.behavioral.strategy.logformatter;

import java.time.LocalDateTime;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        GitConsole console = new GitConsole(new FullLogFormatter());
        console.printLog(List.of(new Log("3976f3a2b1b258afead13e15a45cce53cd99c670", "cleancoder", "Clean up", LocalDateTime.now()),
                new Log("07aa35b3488abd589e9a42a3b1c0176b82b3a4d5", "cleancoder", "Fix NPE in LogFormatter", LocalDateTime.now())));
    }
}
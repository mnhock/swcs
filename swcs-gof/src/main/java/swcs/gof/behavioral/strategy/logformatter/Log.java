package swcs.gof.behavioral.strategy.logformatter;

import java.time.LocalDateTime;

public final class Log {

    private final String hash;
    private final String author;
    private final String message;
    private final LocalDateTime date;

    public Log(String hash, String author, String message, LocalDateTime date) {
        this.hash = hash;
        this.author = author;
        this.message = message;
        this.date = date;
    }

    public String hash() {
        return this.hash;
    }

    public String author() {
        return this.author;
    }

    public String message() {
        return this.message;
    }

    public LocalDateTime date() {
        return this.date;
    }
}

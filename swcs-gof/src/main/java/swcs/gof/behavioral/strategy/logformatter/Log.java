package swcs.gof.behavioral.strategy.logformatter;

import java.time.LocalDateTime;

public record Log(String hash, String author, String message, LocalDateTime date) {

}

package swcs.gof.structural.decorator.message;

import java.time.LocalDateTime;

public class TimeStampMessage implements Message {

    private final Message message;

    public TimeStampMessage(Message message) {
        this.message = message;
    }

    @Override
    public void print(String text) {
        this.message.print(String.format("%s %s", LocalDateTime.now(), text));
    }
}

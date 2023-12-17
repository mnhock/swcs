package swcs.gof.structural.bridge.message;

public abstract class Message {

    private final MessageSender messageSender;

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public MessageSender messageSender() {
        return this.messageSender;
    }

    abstract void send();
}
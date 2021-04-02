package swcs.gof.structural.bridge.message;

public class SmsMessage extends Message {

    public SmsMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender().sendMessage();
    }
}
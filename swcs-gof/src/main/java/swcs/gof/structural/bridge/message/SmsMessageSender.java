package swcs.gof.structural.bridge.message;

public class SmsMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending sms message...");
    }
}
package swcs.gof.structural.bridge.message;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending email message...");
    }
}
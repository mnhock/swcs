package swcs.gof.structural.bridge.message;

class Client {

    public static void main(String[] args) {
        sendSms();
        sendEmail();
    }

    private static void sendSms() {
        MessageSender sender = new SmsMessageSender();
        Message message = new SmsMessage(sender);
        message.send();
    }

    private static void sendEmail() {
        MessageSender sender = new EmailMessageSender();
        Message message = new EmailMessage(sender);
        message.send();
    }
}
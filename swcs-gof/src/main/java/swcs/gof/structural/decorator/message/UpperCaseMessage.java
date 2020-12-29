package swcs.gof.structural.decorator.message;

public class UpperCaseMessage implements Message {

    private final Message message;

    public UpperCaseMessage(Message message) {
        this.message = message;
    }

    @Override
    public void print(String text) {
        this.message.print(text.toUpperCase());
    }
}

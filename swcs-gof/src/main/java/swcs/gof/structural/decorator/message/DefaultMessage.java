package swcs.gof.structural.decorator.message;

public class DefaultMessage implements Message {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}

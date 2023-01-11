package swcs.gof.behavioral.mediator.chat;

public class User {

    private final ChatMediator mediator;
    private final String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public ChatMediator mediator() {
        return this.mediator;
    }

    public String name() {
        return this.name;
    }

    public void send(String message) {
        System.out.println(name() + ": Sending Message=" + message);
        mediator().sendMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name() + ": Received Message:" + message);
    }
}
package swcs.gof.behavioral.mediator.chat;

public class AnonymousUser extends User {

    public AnonymousUser(ChatMediator mediator) {
        super(mediator, "Anonymous");
    }

}
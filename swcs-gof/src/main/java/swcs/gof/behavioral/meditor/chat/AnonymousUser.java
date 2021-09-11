package swcs.gof.behavioral.meditor.chat;

public class AnonymousUser extends User {

    public AnonymousUser(ChatMediator mediator) {
        super(mediator, "Anonymous");
    }

}
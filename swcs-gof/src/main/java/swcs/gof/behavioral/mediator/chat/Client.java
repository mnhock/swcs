package swcs.gof.behavioral.mediator.chat;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new Chat();
        User user1 = new LoggedInUser(mediator, "Lia");
        User user2 = new LoggedInUser(mediator, "Timo");
        User user3 = new LoggedInUser(mediator, "Matheo");
        User user4 = new LoggedInUser(mediator, "Luisa");
        User user5 = new AnonymousUser(mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi to everybody!");
    }
}
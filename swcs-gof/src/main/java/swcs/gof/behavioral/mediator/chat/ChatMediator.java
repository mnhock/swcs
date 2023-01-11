package swcs.gof.behavioral.mediator.chat;

interface ChatMediator {

    void sendMessage(User user, String message);

    void addUser(User user);
}
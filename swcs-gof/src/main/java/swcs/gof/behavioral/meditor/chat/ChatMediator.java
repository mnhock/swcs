package swcs.gof.behavioral.meditor.chat;

interface ChatMediator {

    void sendMessage(User user, String message);

    void addUser(User user);
}
package swcs.gof.behavioral.meditor.chat;

import java.util.ArrayList;
import java.util.List;

public final class Chat implements ChatMediator {

    private final List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User fromUser, String message) {
        for (User user : this.users) {
            if (user != fromUser) {
                user.receive(message);
            }
        }
    }
}
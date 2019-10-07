package swcs.junit.subscriber;

import java.util.Collection;
import java.util.HashSet;

public class RaceResultsService {

    private final Collection<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void send(Message message) {
        for (Client client : this.clients) {
            client.receive(message);
        }
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}
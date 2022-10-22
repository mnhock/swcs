package swcs.mockito.raceresults;

import java.util.Collection;
import java.util.HashSet;

public class RaceResultsService {

    private final Collection<Client> clients;

    public RaceResultsService() {
        this.clients = new HashSet<>();
    }

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }

    public void send(Message message) {
        for (Client client : this.clients) {
            client.receive(message);
        }
    }
}
package swcs.mockito.raceresults;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RaceResultsServiceTest {

    private final RaceResultsService raceResults = new RaceResultsService();

    @Mock
    private Client clientA;
    @Mock
    private Client clientB;
    @Mock
    private Message message;

    @Test
    void notSubscribedClientShouldNotReceiveMessage() {
        this.raceResults.send(this.message);

        verify(this.clientA, never()).receive(this.message);
        verify(this.clientB, never()).receive(this.message);
    }

    @Test
    void subscribedClientShouldReceiveMessage() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.send(this.message);

        verify(this.clientA).receive(this.message);
    }

    @Test
    void allSubscribedClientsShouldReceiveMessages() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.addSubscriber(this.clientB);
        this.raceResults.send(this.message);

        verify(this.clientA).receive(this.message);
        verify(this.clientB).receive(this.message);
    }

    @Test
    void shouldSendOnlyOneMessageToMultiSubscriber() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.send(this.message);

        verify(this.clientA).receive(this.message);
    }

    @Test
    void unsubscribedClientShouldNotReceiveMessages() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.removeSubscriber(this.clientA);
        this.raceResults.send(this.message);

        verify(this.clientA, never()).receive(this.message);
    }
}
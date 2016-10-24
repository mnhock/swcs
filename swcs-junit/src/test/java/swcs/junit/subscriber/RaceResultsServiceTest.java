package swcs.junit.subscriber;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RaceResultsServiceTest {

    private RaceResultsService raceResults;
    @Mock
    private Client clientA;
    @Mock
    private Client clientB;
    @Mock
    private Message message;

    @Before
    public void setUp() {
        this.raceResults = new RaceResultsService();
    }

    @Test
    public void notSubscribedClientShouldNotReceiveMessage() {
        this.raceResults.send(this.message);

        verify(this.clientA, never()).receive(this.message);
        verify(this.clientB, never()).receive(this.message);
    }

    @Test
    public void subscribedClientShouldReceiveMessage() {
        this.raceResults.send(this.message);
        verify(this.clientA, never()).receive(this.message);
        verify(this.clientB, never()).receive(this.message);

        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.send(this.message);
        verify(this.clientA).receive(this.message);
    }

    @Test
    public void allSubscribedClientsShouldReceiveMessages() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.addSubscriber(this.clientB);
        this.raceResults.send(this.message);

        verify(this.clientA).receive(this.message);
        verify(this.clientB).receive(this.message);
    }

    @Test
    public void shouldSendOnlyOneMassageToMultiSubscriber() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.send(this.message);

        verify(this.clientA).receive(this.message);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveMessages() {
        this.raceResults.addSubscriber(this.clientA);
        this.raceResults.removeSubscriber(this.clientA);
        this.raceResults.send(this.message);

        verify(this.clientA, never()).receive(this.message);
    }
}
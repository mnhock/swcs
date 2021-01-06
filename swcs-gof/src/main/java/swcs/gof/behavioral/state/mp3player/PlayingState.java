package swcs.gof.behavioral.state.mp3player;

public class PlayingState implements State {

    public PlayingState() {
        System.out.println("Play state");
    }

    @Override
    public void pressPlay(MP3Player player) {
        player.setState(new StandByState());
    }
}
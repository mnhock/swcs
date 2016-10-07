package swcs.gof.behavioral.state;

public class PlayingState implements State {

    public PlayingState() {
        System.out.println("Play state");
    }

    @Override
    public void pressPlay(MP3PlayerContext context) {
        context.setState(new StandByState());
    }
}
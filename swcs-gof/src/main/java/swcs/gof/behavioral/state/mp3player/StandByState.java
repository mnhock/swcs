package swcs.gof.behavioral.state.mp3player;

public class StandByState implements State {

    public StandByState() {
        System.out.println("Standby state");
    }

    @Override
    public void pressPlay(MP3PlayerContext context) {
        context.setState(new PlayingState());
    }
}

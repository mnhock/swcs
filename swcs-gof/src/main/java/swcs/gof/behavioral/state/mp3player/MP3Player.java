package swcs.gof.behavioral.state.mp3player;

public class MP3Player {

    private State state;

    public MP3Player(State state) {
        this.state = state;
    }

    public void play() {
        this.state.pressPlay(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
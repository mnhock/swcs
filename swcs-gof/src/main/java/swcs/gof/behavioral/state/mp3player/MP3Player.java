package swcs.gof.behavioral.state.mp3player;

public class MP3Player {

    private State state;

    public MP3Player(State state) {
        this.state = state;
    }

    public void play() {
        this.state.pressPlay(this);
    }

    public void state(State state) {
        this.state = state;
    }

    public State state() {
        return this.state;
    }
}
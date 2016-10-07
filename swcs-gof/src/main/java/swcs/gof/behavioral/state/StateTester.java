package swcs.gof.behavioral.state;

public class StateTester {

    public static void main(String[] args) {
        MP3PlayerContext context = new MP3PlayerContext(new PlayingState());
        context.play();
        context.play();
        context.play();
        context.play();
        context.play();
        context.play();
        context.play();
    }
}
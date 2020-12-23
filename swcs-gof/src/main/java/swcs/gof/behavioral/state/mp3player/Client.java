package swcs.gof.behavioral.state.mp3player;

public class Client {

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
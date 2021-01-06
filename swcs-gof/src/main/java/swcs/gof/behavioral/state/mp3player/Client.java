package swcs.gof.behavioral.state.mp3player;

public class Client {

    public static void main(String[] args) {
        MP3Player player = new MP3Player(new PlayingState());
        player.play();
        player.play();
        player.play();
        player.play();
        player.play();
        player.play();
    }
}
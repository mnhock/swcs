package swcs.gof.behavioral.observer.influencer;

public class Follower implements Observer {

    private final String follower;

    public Follower(String follower) {
        this.follower = follower;
    }

    @Override
    public void update(Object message) {
        System.out.println(String.format("%s received message: %s", this.follower, message));
    }
}
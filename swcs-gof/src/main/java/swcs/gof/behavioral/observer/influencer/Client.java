package swcs.gof.behavioral.observer.influencer;

public class Client {

    public static void main(String[] args) {
        Influencer influencer = new Influencer("Java");

        influencer.register(new Follower("PHP"));
        influencer.register(new Follower("QBasic"));
        influencer.register(new Follower("TypeScript"));

        influencer.notifyAllObservers("Java rocks!");
    }
}
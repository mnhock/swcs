package swcs.gof.behavioral.observer.influencer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Influencer implements Subject {

    private final Queue<Observer> followers = new ConcurrentLinkedQueue<>();

    private final String name;

    public Influencer(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer follower) {
        this.followers.add(follower);
    }

    @Override
    public void unregister(Observer follower) {
        this.followers.remove(follower);
    }

    @Override
    public void notifyAllObservers(Object message) {
        this.followers.forEach(follower -> follower.update(message));
    }
}

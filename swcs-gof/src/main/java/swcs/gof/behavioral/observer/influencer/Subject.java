package swcs.gof.behavioral.observer.influencer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers(Object message);

}

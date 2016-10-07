package swcs.gof.behavioral.observer;

public class ObserverTester {

    public static void main(String[] args) {
        Screen screen = new Screen();
        DataStore dataStore = new DataStore();

        // register observer
        dataStore.addObserver(screen);
        dataStore.addObserver(new SecondScreen());

        // do something with dataStore
        dataStore.setData("changed");

        // send a notification
        dataStore.notifyObservers();
    }
}

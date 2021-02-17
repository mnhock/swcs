package swcs.gof.behavioral.observer.datastore;

import java.util.Observable;

public class DataStore extends Observable {

    private String data;

    public String data() {
        return this.data;
    }

    public void data(String data) {
        this.data = data;
        // mark the observable as changed
        setChanged();
    }
}
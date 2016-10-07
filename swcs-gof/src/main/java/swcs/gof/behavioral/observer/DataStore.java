package swcs.gof.behavioral.observer;

import java.util.Observable;

public class DataStore extends Observable {

    private String data;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
        // mark the observable as changed
        setChanged();
    }
}
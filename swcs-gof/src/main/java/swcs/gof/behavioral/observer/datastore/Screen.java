package swcs.gof.behavioral.observer.datastore;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update on screen with data: " + ((DataStore) o).getData());
    }
}

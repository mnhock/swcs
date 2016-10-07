package swcs.gof.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class SecondScreen implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update on second screen with data: " + ((DataStore) o).getData());
    }
}

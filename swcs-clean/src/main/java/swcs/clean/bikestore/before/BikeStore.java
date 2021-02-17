package swcs.clean.bikestore.before;

import java.util.ArrayList;

public class BikeStore {

    ArrayList<Bike> bikes;

    public BikeStore() {
        this.bikes = new ArrayList();
    }

    public boolean addBike(Bike bike) {
        return this.bikes.add(bike);
    }

    public ArrayList findBikes(int type) {
        ArrayList founds = new ArrayList();

        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).type() == type) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

    public ArrayList findBikes(float lowerLimit, float upperLimit) {
        ArrayList founds = new ArrayList();

        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).price() >= lowerLimit && bikes.get(i).price() <= upperLimit) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

    public ArrayList findBikes(float lowerLimit, float upperLimit, int type) {
        ArrayList founds = new ArrayList();

        for (int i = 0; i < bikes.size(); i++) {
            if ((bikes.get(i).price() >= lowerLimit && bikes.get(i).price() <= upperLimit) && bikes.get(i).type() == type) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

}

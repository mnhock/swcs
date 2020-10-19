package swcs.clean.car.before;

import java.util.ArrayList;
import java.util.Date;

public class ImmutableCar {

    private String vin;
    private Date manufactored;
    private ArrayList previousOwners = new ArrayList();

    public ImmutableCar(String number, Date manufactored) {
        this.vin = number;
        this.manufactored = manufactored;
    }

    public Date getManufactored() {
        return this.manufactored;
    }

    public String getVin() {
        return this.vin;
    }

    public ArrayList getPreviousOwners() {
        return this.previousOwners;
    }

    public boolean addPreviousOwner(String text) {
        text.trim();
        return this.previousOwners.add(text);
    }
}

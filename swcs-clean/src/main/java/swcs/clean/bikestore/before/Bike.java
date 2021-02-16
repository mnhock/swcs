package swcs.clean.bikestore.before;

public class Bike {

    public static final int TYPE_MTB = 0;
    public static final int TYPE_ROAD = 1;
    public static final int TYPE_CITY = 2;

    private int type;
    private float price;
    private String manufacturer;

    public Bike(String manufacturer, int type, float price) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getType() {
        return this.type;
    }

    public float getPrice() {
        return this.price;
    }

    public boolean isFullSuspension() {
        return switch (this.type) {
        case 0 -> true;
        case 1 -> false;
        case 2 -> false;
        default -> false;
        };
    }
}

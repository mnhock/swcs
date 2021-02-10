package swcs.gof.creational.prototype.copy.person;

public class Address {

    private String city;
    private String street;

    // Copy constructor
    public Address(Address address) {
        this(address.getCity(), address.getStreet());
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Copy factory
    public static Address newInstance(Address address) {
        return new Address(address.getCity(), address.getStreet());
    }
}
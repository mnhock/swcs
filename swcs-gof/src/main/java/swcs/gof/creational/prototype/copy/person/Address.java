package swcs.gof.creational.prototype.copy.person;

public class Address {

    private String city;
    private String street;

    // Copy constructor
    public Address(Address address) {
        this(address.city(), address.street());
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String city() {
        return this.city;
    }

    public void city(String city) {
        this.city = city;
    }

    public String street() {
        return this.street;
    }

    public void street(String street) {
        this.street = street;
    }

    // Copy factory
    public static Address newInstance(Address address) {
        return new Address(address.city(), address.street());
    }
}
package swcs.gof.creational.prototype.deep.person;

public class Address implements Cloneable {

    private String city;
    private String street;

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

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
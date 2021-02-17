package swcs.gof.creational.prototype.copy.person;

public class Person {

    private String name;
    private Address address;

    // Copy constructor
    public Person(Person person) {
        this(person.name(), new Address(person.address()));
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String name() {
        return this.name;
    }

    public void name(String name) {
        this.name = name;
    }

    public Address address() {
        return this.address;
    }

    public void address(Address address) {
        this.address = address;
    }

    // Copy factory
    public static Person newInstance(Person person) {
        return new Person(person.name(), new Address(person.address()));
    }
}

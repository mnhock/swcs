package swcs.gof.creational.prototype.copy.person;

public class Person {

    private String name;
    private Address address;

    // Copy constructor
    public Person(Person person) {
        this(person.getName(), new Address(person.getAddress()));
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Copy factory
    public static Person newInstance(Person person) {
        return new Person(person.getName(), new Address(person.getAddress()));
    }
}

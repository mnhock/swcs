package swcs.gof.creational.prototype.deep.person;

public class Person implements Cloneable {

    private String name;
    private Address address;

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

    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.address(person.address.clone());

            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

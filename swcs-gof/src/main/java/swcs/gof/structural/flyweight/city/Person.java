package swcs.gof.structural.flyweight.city;

import java.util.Objects;

public final class Person {

    private final String firstName;
    private final String lastName;
    private final String street;
    private final City city;

    public Person(String firstName, String lastName, String street, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
    }

    public String firstName() {
        return this.firstName;
    }

    public String lastName() {
        return this.lastName;
    }

    public String street() {
        return this.street;
    }

    public City city() {
        return this.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.city, this.firstName, this.lastName, this.street);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;
        return Objects.equals(this.city, other.city)
                && Objects.equals(this.firstName, other.firstName)
                && Objects.equals(this.lastName, other.lastName)
                && Objects.equals(this.street, other.street);
    }

}

package swcs.gof.structural.flyweight.city;

import java.util.Objects;

public final class City {

    private final String country;
    private final String countryCode;
    private final String name;

    public City(String country, String countryCode, String name) {
        this.country = country;
        this.countryCode = countryCode;
        this.name = name;
    }

    public String country() {
        return this.country;
    }

    public String countryCode() {
        return this.countryCode;
    }

    public String name() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.countryCode);
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
        City other = (City) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.countryCode, other.countryCode);
    }

}

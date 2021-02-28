package swcs.gof.structural.flyweight.city;

import java.util.HashSet;
import java.util.Set;

public final class CityFactory {

    private final Set<City> cities = new HashSet<>();

    public City of(String country, String countryCode, String name) {
        for (City city : this.cities) {
            if (city.country().equals(country)
                    && city.countryCode().equals(countryCode)
                    && city.name().equals(name)) {
                return city;
            }
        }

        City city = new City(country, countryCode, name);
        this.cities.add(city);

        return city;
    }

}

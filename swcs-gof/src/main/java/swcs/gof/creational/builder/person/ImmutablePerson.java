package swcs.gof.creational.builder.person;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {

    private final String name;
    private final String city;
    private final List<String> favoriteDishes;

    private ImmutablePerson(Builder builder) {
        this.name = builder.name;
        this.city = builder.city;
        this.favoriteDishes = builder.favoriteDishes;
    }

    public String name() {
        return this.name;
    }

    public String city() {
        return this.city;
    }

    public List<String> favoriteDishes() {
        return this.favoriteDishes != null ? new ArrayList<>(this.favoriteDishes) : null;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String name;
        private String city;
        private List<String> favoriteDishes;

        public Builder() {
            this.favoriteDishes = new ArrayList<>();
        }

        public Builder(ImmutablePerson person) {
            this.name = person.name;
            this.city = person.city;
            this.favoriteDishes = person.favoriteDishes != null ? new ArrayList<>(person.favoriteDishes) : null;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder addFavoriteDish(String dish) {
            this.favoriteDishes.add(dish);
            return this;
        }

        public Builder removeFavoriteDish(String dish) {
            this.favoriteDishes.remove(dish);
            return this;
        }

        public ImmutablePerson build() {
            return new ImmutablePerson(this);
        }
    }
}

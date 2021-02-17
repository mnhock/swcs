package swcs.rental.after;

import java.util.Objects;

abstract class AbstractMovie implements Movie {

    private final String title;

    AbstractMovie(String title) {
        this.title = Objects.requireNonNull(title);
    }

    @Override
    public String title() {
        return this.title;
    }

}

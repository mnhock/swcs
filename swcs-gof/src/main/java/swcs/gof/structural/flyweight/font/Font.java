package swcs.gof.structural.flyweight.font;

import java.util.Objects;

public final class Font {

    private final String name;
    private final int size;

    public Font(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String name() {
        return this.name;
    }

    public int size() {
        return this.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.size);
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
        Font other = (Font) obj;
        return Objects.equals(this.name, other.name) && this.size == other.size;
    }

}

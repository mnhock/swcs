package swcs.junit.fridge;

import java.util.Collection;
import java.util.HashSet;

public class Fridge {

    private final Collection<String> foods;

    public Fridge() {
        this.foods = new HashSet<>();
    }

    public boolean put(String item) {
        return this.foods.add(item);
    }

    public boolean contains(String item) {
        return this.foods.contains(item);
    }

    public void take(String item) throws NoSuchItemException {
        boolean result = this.foods.remove(item);

        if (!result) {
            throw new NoSuchItemException();
        }
    }
}

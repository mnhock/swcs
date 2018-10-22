package swcs.gof.creational.builder2;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePersonTester {
    public static void main(String[] args) {
        List<String> dishes = new ArrayList<>();
        dishes.add("Nudeln");
        dishes.add("Müsli");
        dishes.add("Pfannkuchen");

        ImmutablePerson immutablePerson1 = ImmutablePerson.builder()
                .withName("Timo")
                .withCity("Nürnberg")
                .withFavoriteDishes(dishes)
                .build();

        List<String> dishes2 = immutablePerson1.getFavoriteDishes();
        dishes2.add("Brei");

        ImmutablePerson immutablePerson2 = ImmutablePerson.builder()
                .withName("Lia")
                .withCity("Nürnberg")
                .withFavoriteDishes(dishes2)
                .build();

        ImmutablePerson updatedPerson = immutablePerson2.toBuilder()
                .withCity("Schönau")
                .build();

    }
}

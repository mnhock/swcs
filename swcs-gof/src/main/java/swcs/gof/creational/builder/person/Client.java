package swcs.gof.creational.builder.person;

public class Client {

    public static void main(String[] args) {
        ImmutablePerson timo = ImmutablePerson.builder()
                .withName("Timo")
                .withCity("Nürnberg")
                .addFavoriteDish("Nudeln")
                .addFavoriteDish("Müsli")
                .addFavoriteDish("Pfannkuchen")
                .build();

        ImmutablePerson lia = ImmutablePerson.builder()
                .withName("Lia")
                .withCity("Nürnberg")
                .addFavoriteDish("Wurst")
                .addFavoriteDish("Wienerle")
                .build();

        ImmutablePerson timoAfterMove = timo.toBuilder()
                .withCity("Schönau")
                .build();

        ImmutablePerson liaAfterMove = lia.toBuilder()
                .withCity("Schönau")
                .build();
    }
}

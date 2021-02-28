package swcs.gof.structural.flyweight.font;

public class Client {

    public static void main(String[] args) {
        FontFactory factory = new FontFactory();

        System.out.println(factory.of("Helvetica", 12));
        System.out.println(factory.of("Arial ", 10));

        // Will return same objects
        System.out.println(factory.of("Helvetica", 12));
        System.out.println(factory.of("Arial ", 10));
    }
}

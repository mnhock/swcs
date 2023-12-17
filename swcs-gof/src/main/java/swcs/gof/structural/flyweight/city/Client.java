package swcs.gof.structural.flyweight.city;

class Client {

    public static void main(String[] args) {
        CityFactory factory = new CityFactory();

        // Will use same city instance
        new Person("Forster", "Gamlen", "7654 Ruskin Center", factory.of("United States", "US", "Carson City"));
        new Person("Nevin", "Roddell", "5 Del Sol Alley", factory.of("United States", "US", "Carson City"));
        new Person("Hunter", "Lewins", "33733 Heffernan Circle", factory.of("United States", "US", "Carson City"));

        new Person("Reube", "Gregoretti", "08 Melrose Street", factory.of("Japan", "JP", "Mutsu"));
    }
}

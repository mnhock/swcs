package swcs.gof.creational.singleton.eager;

public final class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    // Eager Loading
    public static Singleton getInstance() {
        return instance;
    }
}

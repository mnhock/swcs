package swcs.gof.creational.singleton.eager;

public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    // Eager Loading
    public static Singleton getInstance() {
        return instance;
    }
}

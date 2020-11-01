package swcs.gof.creational.singleton.lazy;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //Lazy Loading
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

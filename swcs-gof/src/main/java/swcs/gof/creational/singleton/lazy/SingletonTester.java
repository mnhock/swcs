package swcs.gof.creational.singleton.lazy;

public class SingletonTester {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
        System.out.println(Singleton.getInstance().toString());
    }
}

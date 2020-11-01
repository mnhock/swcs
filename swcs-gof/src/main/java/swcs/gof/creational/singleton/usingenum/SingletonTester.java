package swcs.gof.creational.singleton.usingenum;

public class SingletonTester {

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.equals(Singleton.INSTANCE));

    }
}

package swcs.gof.creational.singleton.eager;

public class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
        System.out.println(Singleton.getInstance().toString());
    }
}

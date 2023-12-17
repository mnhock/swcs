package swcs.gof.creational.singleton.usingenum;

class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE == Singleton.INSTANCE);

    }
}

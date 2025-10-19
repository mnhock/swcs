package swcs.gof.creational.singleton.staticholder;

import swcs.gof.creational.singleton.lazy.Singleton;

class Client {

    public static void main(String[] args) {
        System.out.println(swcs.gof.creational.singleton.lazy.Singleton.getInstance().toString());
        System.out.println(Singleton.getInstance().toString());
    }
}

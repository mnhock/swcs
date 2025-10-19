package swcs.gof.creational.singleton.staticholder;

public final class Singleton {

  private Singleton() {
  }

  private static class Holder {
    static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return Holder.INSTANCE;
  }
}

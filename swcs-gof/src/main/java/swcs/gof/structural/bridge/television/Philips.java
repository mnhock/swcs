package swcs.gof.structural.bridge.television;

public class Philips implements Television {

    @Override
    public void on() {
        System.out.println("On");
    }

    @Override
    public void off() {
        System.out.println("Off");
    }

    @Override
    public void channel(int channel) {
        System.out.println(channel);
    }
}
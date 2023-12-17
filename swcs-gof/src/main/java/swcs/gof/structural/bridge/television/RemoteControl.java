package swcs.gof.structural.bridge.television;

public abstract class RemoteControl {

    private final Television television;

    protected RemoteControl(Television television) {
        this.television = television;
    }

    public void on() {
        this.television.on();
    }

    public void off() {
        this.television.off();
    }

    public void channel(int channel) {
        this.television.channel(channel);
    }
}
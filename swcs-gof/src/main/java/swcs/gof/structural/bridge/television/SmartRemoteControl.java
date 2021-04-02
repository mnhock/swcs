package swcs.gof.structural.bridge.television;

public class SmartRemoteControl extends RemoteControl {

    private int channel;

    public SmartRemoteControl(Television television) {
        super(television);
    }

    public void nextChannel() {
        this.channel++;
        channel(this.channel);
    }

    public void previousChannel() {
        this.channel--;
        channel(this.channel);
    }
}
package swcs.gof.structural.bridge.television;

public class Client {

    public static void main(String[] args) {
        useSamsung();
        usePhilips();
    }

    private static void useSamsung() {
        Television television = new Samsung();
        SmartRemoteControl remoteControl = new SmartRemoteControl(television);

        remoteControl.on();
        remoteControl.nextChannel();
        remoteControl.nextChannel();
        remoteControl.previousChannel();
        remoteControl.off();
    }

    private static void usePhilips() {
        Television television = new Philips();
        SmartRemoteControl remoteControl = new SmartRemoteControl(television);

        remoteControl.on();
        remoteControl.nextChannel();
        remoteControl.nextChannel();
        remoteControl.previousChannel();
        remoteControl.off();
    }
}

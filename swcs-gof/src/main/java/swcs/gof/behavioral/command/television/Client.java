package swcs.gof.behavioral.command.television;

class Client {

    public static void main(String[] args) {
        Television television = new Television();

        DeviceButton power = new DeviceButton();
        DeviceButton volume = new DeviceButton();

        power.command(new TurnOn(television));
        power.press();

        volume.command(new VolumeUp(television));
        volume.press();
        volume.press();
        volume.press();

        volume.command(new VolumeDown(television));
        volume.press();

        power.command(new TurnOff(television));
        power.press();
    }
}

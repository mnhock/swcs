package swcs.gof.behavioral.command.television;

public class DeviceButton {

    private Command command;

    public void command(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }
}

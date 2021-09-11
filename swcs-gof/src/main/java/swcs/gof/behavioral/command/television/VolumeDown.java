package swcs.gof.behavioral.command.television;

public class VolumeDown implements Command {

    private final Television device;

    public VolumeDown(Television device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.volumeDown();
    }
}

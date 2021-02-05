package swcs.gof.behavioral.command.television;

public class VolumeUp implements Command {

    private final Television device;

    public VolumeUp(Television device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.volumeUp();
    }
}

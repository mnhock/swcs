package swcs.gof.behavioral.command.television;

public class TurnOff implements Command {

    private final Television device;

    public TurnOff(Television device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.off();
    }
}

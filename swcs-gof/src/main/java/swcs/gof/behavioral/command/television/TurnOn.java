package swcs.gof.behavioral.command.television;

public class TurnOn implements Command {

    private final Television device;

    public TurnOn(Television device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.on();
    }
}

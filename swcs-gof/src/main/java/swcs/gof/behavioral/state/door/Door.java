package swcs.gof.behavioral.state.door;

public class Door {

    private DoorState state;

    public Door(DoorState state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }

    public void setState(DoorState state) {
        this.state = state;
    }

    public DoorState getState() {
        return this.state;
    }
}
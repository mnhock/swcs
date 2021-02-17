package swcs.gof.behavioral.state.door;

public class Door {

    private DoorState state;

    public Door(DoorState state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }

    public void state(DoorState state) {
        this.state = state;
    }

    public DoorState state() {
        return this.state;
    }
}
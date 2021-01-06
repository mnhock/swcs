package swcs.gof.behavioral.state.door;

public class DoorClosed implements DoorState {

    public DoorClosed() {
        System.out.println("Door closed");
    }

    @Override
    public void handle(Door door) {
        door.setState(new DoorOpening());
    }
}

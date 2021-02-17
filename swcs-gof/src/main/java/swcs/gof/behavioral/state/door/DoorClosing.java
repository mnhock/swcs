package swcs.gof.behavioral.state.door;

public class DoorClosing implements DoorState {

    public DoorClosing() {
        System.out.println("Door closing");
    }

    @Override
    public void handle(Door door) {
        door.state(new DoorClosed());
    }
}

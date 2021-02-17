package swcs.gof.behavioral.state.door;

public class DoorOpen implements DoorState {

    public DoorOpen() {
        System.out.println("Door open");
    }

    @Override
    public void handle(Door door) {
        door.state(new DoorClosing());
    }
}
package swcs.gof.behavioral.state.door;

public class DoorOpening implements DoorState {

    public DoorOpening() {
        System.out.println("Door opening");
    }

    @Override
    public void handle(Door door) {
        door.state(new DoorOpen());
    }
}

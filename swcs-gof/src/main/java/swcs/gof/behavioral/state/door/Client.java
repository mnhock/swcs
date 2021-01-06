package swcs.gof.behavioral.state.door;

public class Client {

    public static void main(String[] args) {
        Door door = new Door(new DoorOpen());
        door.handle();
        door.handle();
        door.handle();
        door.handle();
        door.handle();
        door.handle();
    }
}
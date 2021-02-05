package swcs.gof.behavioral.command.television;

public class Television {

    private int volume = 0;

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void volumeUp() {
        this.volume++;

        System.out.println("Volume: " + this.volume);
    }

    public void volumenDown() {
        this.volume--;

        System.out.println("Volume: " + this.volume);
    }
}

package swcs.dp.srp.modem.after;

public final class Modem implements Connection, DataChannel {

    @Override
    public void dial(String phoneNumber) {
        // logic
    }

    @Override
    public void hangup() {
        // logic
    }

    @Override
    public void send(char c) {
        // logic
    }

    @Override
    public char receive() {
        // logic
        return 'L'; // dummy return
    }
}

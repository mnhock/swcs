package swcs.dp.srp.modem.after;

public final class Modem implements Connection, DataChannel {
    private final Connection connection;
    private final DataChannel dataChannel;

    public Modem(Connection connection, DataChannel dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        this.connection.dial(phoneNumber);
    }

    @Override
    public void hangup() {
        this.connection.hangup();
    }

    @Override
    public void send(char c) {
        this.dataChannel.send(c);
    }

    @Override
    public char receive() {
        return this.dataChannel.receive();
    }
}

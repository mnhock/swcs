package swcs.dp.srp.modem.after;

public class Client {

    public static void main(String[] args) {
        Modem modem = new Modem(new DefaultConnection(), new DefaultDataChannel());

        subsystemConnection(modem);
        subsystemDataChannel(modem);
    }

    private static void subsystemConnection(Connection connection) {
        // Only Connection methods visible
        connection.hangup();
    }

    private static void subsystemDataChannel(DataChannel channel) {
        // Only DataChannel methods visible
        channel.receive();
    }

    private static final class DefaultDataChannel implements DataChannel {

        @Override
        public void send(char c) {
        }

        @Override
        public char receive() {
            return 0;
        }
    }

    private static final class DefaultConnection implements Connection {

        @Override
        public void hangup() {
        }

        @Override
        public void dial(String phoneNumber) {
        }
    }

}

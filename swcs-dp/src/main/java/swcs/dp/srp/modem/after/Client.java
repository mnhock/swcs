package swcs.dp.srp.modem.after;

public class Client {

    public static void main(String[] args) {
        Modem modem = new Modem();

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
}

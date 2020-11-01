package swcs.dp.srp.modem.after;

public interface DataChannel {

    void send(char c);

    char receive();
}

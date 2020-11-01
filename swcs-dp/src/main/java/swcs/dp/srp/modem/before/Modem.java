package swcs.dp.srp.modem.before;

public interface Modem {

    // Connection management responsibilities
    void dial(String phoneNumber);

    void hangup();

    // Data management responsibilities
    void send(char c);

    char receive();
}
